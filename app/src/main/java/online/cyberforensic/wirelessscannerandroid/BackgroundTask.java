package online.cyberforensic.wirelessscannerandroid;

import android.content.Context;
import android.util.Base64;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class BackgroundTask {

    public static final String EXTRA_DEVICE_NAME = "devName";
    public static final String EXTRA_DEVICE_TYPE = "devType";
    public static final String EXTRA_DEVICE_MANUF = "devManuf";
    public static final String EXTRA_DEVICE_MAC = "devMac";

    private String json_url = "http://27.96.91.193:2501/devices/views/all/devices.json";
    private String USERNAME = "user";
    private String PASSWORD = "user";

    Context context;
    ArrayList<Device> arrayList = new ArrayList<>();

    public BackgroundTask(Context context) {
        this.context = context;
    }

    public interface VolleyResponseListener{
        void onError(String message);

        void onResponse(ArrayList<Device> arrayList);
    }

    public void getList(String type,VolleyResponseListener volleyResponseListener){
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, json_url, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {
//                Toast.makeText(context, response.toString(), Toast.LENGTH_SHORT).show();
                int count = 0;
                while (count< response.length()){
                    try {
                        JSONObject jsonObject = response.getJSONObject(count);

                        Device devices = new Device(
                                jsonObject.getString("kismet.device.base.commonname"),
                                jsonObject.getString("kismet.device.base.manuf"),
                                jsonObject.getString("kismet.device.base.type"),
                                jsonObject.getString("kismet.device.base.macaddr")
                                );

                        char macAddressRandomization = jsonObject.getString("kismet.device.base.macaddr").charAt(1);
                        if(macAddressRandomization == 'A' || macAddressRandomization == '2' ||macAddressRandomization == 'E' || macAddressRandomization == '6'){

                        }else {
                            switch (type) {
                                case "AP":
                                    if (jsonObject.getString("kismet.device.base.type").contains("AP")) {
                                        arrayList.add(devices);
                                    }
                                    break;
                                case "Client":
                                    if (jsonObject.getString("kismet.device.base.type").contains("Client")) {
                                        arrayList.add(devices);
                                    }
                                    break;
                                case "Bridge":
                                    if (jsonObject.getString("kismet.device.base.type").contains("Bridge")) {
                                        arrayList.add(devices);
                                    }
                                    break;
                                case "Ad-Hoc":
                                    if (jsonObject.getString("kismet.device.base.type").contains("Ad-Hoc")) {
                                        arrayList.add(devices);
                                    }
                                    break;
                                default:
                                    arrayList.add(devices);
                                    break;

                            }
                        }

                        count++;

                    } catch (JSONException e) {
                        Toast.makeText(context, "e.toString()", Toast.LENGTH_SHORT).show();
                        e.printStackTrace();
                    }
                }

                volleyResponseListener.onResponse(arrayList);


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Toast.makeText(context, error.toString(), Toast.LENGTH_SHORT).show();
                volleyResponseListener.onError("Something wrong volleyResponseListener");
            }
        }){
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                Map<String, String> headers = new HashMap<String, String>();
                String auth = "Basic "
                        + Base64.encodeToString((USERNAME + ":" + PASSWORD).getBytes(),
                        Base64.NO_WRAP);
                headers.put("Authorization", auth);
                return headers;
            }
        };
        MySingleton.getInstance(context).addToRequestQueue(jsonArrayRequest);
        //return arrayList;
    }
}
