package online.cyberforensic.wirelessscannerandroid;

import android.content.Context;
import android.util.Base64;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.json.JSONArray;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import online.cyberforensic.wirelessscannerandroid.model.Device;


public class BackgroundTask<deviceArray> {

    public static final String EXTRA_DEVICE_NAME = "devName";
    public static final String EXTRA_DEVICE_TYPE = "devType";
    public static final String EXTRA_DEVICE_MANUF = "devManuf";
    public static final String EXTRA_DEVICE_MAC = "devMac";
    public static final String EXTRA_DEVICE_SIGNAL = "devSignal";

    private String json_url = "http://10.0.0.1:2501/devices/views/all/devices.json";
    private String USERNAME = "user";
    private String PASSWORD = "user";

    Context context;
    Device[] deviceArray,finalDeviceArray;
    ArrayList<Device> finalArray = new ArrayList<>();


    public BackgroundTask(Context context) {
        this.context = context;
    }

    public interface VolleyResponseListener{
        void onError(String message);

        void onResponse(Device[] devices);
    }

    public void getList(String type,VolleyResponseListener volleyResponseListener){
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(Request.Method.GET, json_url, null, new Response.Listener<JSONArray>() {
            @Override
            public void onResponse(JSONArray response) {

                GsonBuilder gsonBuilder = new GsonBuilder();
                Gson gson = gsonBuilder.create();
                gson.fromJson(String.valueOf(response),Device[].class);
                deviceArray = gson.fromJson(String.valueOf(response),Device[].class);

                try {

                    for (int i = 0; i < deviceArray.length; i++) {
                        Device device = deviceArray[i];
                        char macAddressRandomization = device.getKismetDeviceBaseMacaddr().charAt(1);

                        // code to filter out randomely generated mac addresses by different devices
                        if (macAddressRandomization == 'K' || macAddressRandomization == 'K' || macAddressRandomization == 'K' || macAddressRandomization == 'K') {

                        }else if((device.getKismetDeviceBaseSignal().getKismetCommonSignalLastSignal() > -70) && (device.getKismetDeviceBaseSignal().getKismetCommonSignalLastSignal() < 0)){
                            switch (type) {
                                case "AP":
                                    if (device.getKismetDeviceBaseType().contains("AP")) {
                                        finalArray.add(device);
                                    }
                                    break;
                                case "Client":
                                    if (device.getKismetDeviceBaseType().contains("Client") || device.getKismetDeviceBaseType().contains("Device")) {
                                        finalArray.add(device);
                                    }
                                    break;
                                case "Bridge":
                                    if (device.getKismetDeviceBaseType().contains("Bridge")) {
                                        finalArray.add(device);
                                    }
                                    break;
                                case "Ad-Hoc":
                                    if (device.getKismetDeviceBaseType().contains("Ad-Hoc")) {
                                        finalArray.add(device);
                                    }
                                    break;
                                default:
                                    finalArray.add(device);
                                    break;

                            }
                        }
                    }
                }catch (Exception e){
                    e.printStackTrace();
                }

                finalDeviceArray = (Device[]) finalArray.toArray(new Device[finalArray.size()]);


                volleyResponseListener.onResponse(finalDeviceArray);



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
