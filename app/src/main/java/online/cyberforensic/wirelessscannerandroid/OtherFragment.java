package online.cyberforensic.wirelessscannerandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import static online.cyberforensic.wirelessscannerandroid.BackgroundTask.EXTRA_DEVICE_MAC;
import static online.cyberforensic.wirelessscannerandroid.BackgroundTask.EXTRA_DEVICE_MANUF;
import static online.cyberforensic.wirelessscannerandroid.BackgroundTask.EXTRA_DEVICE_NAME;
import static online.cyberforensic.wirelessscannerandroid.BackgroundTask.EXTRA_DEVICE_TYPE;
public class OtherFragment extends Fragment implements RecyclerAdapter.OnItemClickListener{

    private RecyclerView recyclerView;
    private RecyclerAdapter recyclerAdapter;
    ArrayList<Device> mArryList ;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_other,container,false);
        recyclerView = view.findViewById(R.id.rvFragment);
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getContext(),DividerItemDecoration.VERTICAL);
        BackgroundTask backgroundTask = new BackgroundTask(getContext());
        backgroundTask.getList("Other", new BackgroundTask.VolleyResponseListener() {
            @Override
            public void onError(String message) {
                Toast.makeText(getActivity(), "Something Wrong", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onResponse(ArrayList<Device> arrayList) {
                mArryList = arrayList;
                recyclerAdapter = new RecyclerAdapter(arrayList,getContext());
                RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
                recyclerView.setLayoutManager(layoutManager);
                recyclerView.setAdapter(recyclerAdapter);
                recyclerAdapter.setOnItemClickListener(OtherFragment.this::onItemClick);
                recyclerView.addItemDecoration(dividerItemDecoration);
                recyclerAdapter.notifyDataSetChanged();

            }
        });

        return view;
    }
    @Override
    public void onItemClick(int position) {
        Intent detailIntent = new Intent(getContext(), DeviceDetails.class);
        Device clickedItem = mArryList.get(position);
        detailIntent.putExtra(EXTRA_DEVICE_NAME, clickedItem.getName());
        detailIntent.putExtra(EXTRA_DEVICE_TYPE, clickedItem.getType());
        detailIntent.putExtra(EXTRA_DEVICE_MANUF, clickedItem.getManuf());
        detailIntent.putExtra(EXTRA_DEVICE_MAC, clickedItem.getMac());

        startActivity(detailIntent);
    }
}
