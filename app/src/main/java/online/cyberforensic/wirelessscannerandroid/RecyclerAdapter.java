package online.cyberforensic.wirelessscannerandroid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import online.cyberforensic.wirelessscannerandroid.model.Device;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.MyViewHolder> {

    Device[] devices;
    private Context context;
    private OnItemClickListener mListener;


    public interface OnItemClickListener{
        void onItemClick(int position);
    }

    public void setOnItemClickListener(OnItemClickListener listener){
        mListener = listener;
    }


    public RecyclerAdapter(Device[] devices, Context cont) {
        this.devices = devices;
        this.context = cont;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ap_item_row,parent,false);
        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Device device = devices[position];
        holder.name.setText(device.getKismetDeviceBaseCommonname());
        holder.manuf.setText(device.getKismetDeviceBaseManuf());
        holder.type.setText(device.getKismetDeviceBaseType());
        holder.mac.setText(device.getKismetDeviceBaseMacaddr());

    }

    @Override
    public int getItemCount() {
        return devices.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView name, manuf,type,mac;
        RelativeLayout relativeLayout;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            relativeLayout = itemView.findViewById(R.id.ap_item_row_layout);
            name = itemView.findViewById(R.id.devNameAP);
            manuf = itemView.findViewById(R.id.devManufAP);
            type = itemView.findViewById(R.id.devTypeAP);
            mac = itemView.findViewById(R.id.devMacAP);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if(mListener != null){
                        int position = getAdapterPosition();
                        if(position != RecyclerView.NO_POSITION){
                            mListener.onItemClick(position);
                        }
                    }

                }
            });
        }


    }
}
