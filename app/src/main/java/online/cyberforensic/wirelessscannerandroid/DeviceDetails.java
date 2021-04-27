package online.cyberforensic.wirelessscannerandroid;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import static online.cyberforensic.wirelessscannerandroid.BackgroundTask.EXTRA_DEVICE_MAC;
import static online.cyberforensic.wirelessscannerandroid.BackgroundTask.EXTRA_DEVICE_MANUF;
import static online.cyberforensic.wirelessscannerandroid.BackgroundTask.EXTRA_DEVICE_NAME;
import static online.cyberforensic.wirelessscannerandroid.BackgroundTask.EXTRA_DEVICE_TYPE;

public class DeviceDetails extends AppCompatActivity {

    TextView deviceType,deviceName,deviceManuf,deviceMac;
    RelativeLayout deviceDetailsLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_device_details);
        deviceType = findViewById(R.id.deviceType);
        deviceName = findViewById(R.id.deviceName);
        deviceManuf = findViewById(R.id.deviceManuf);
        deviceMac = findViewById(R.id.deviceMac);
        deviceDetailsLayout = findViewById(R.id.deviceDetailsLayout);


        Intent intent = getIntent();

        if(intent.getStringExtra(EXTRA_DEVICE_TYPE).contains("AP"))
        {
            deviceDetailsLayout.setBackgroundColor(Color.CYAN);
        }

        deviceType.setText(intent.getStringExtra(EXTRA_DEVICE_TYPE));
        deviceName.setText(intent.getStringExtra(EXTRA_DEVICE_NAME));
        deviceManuf.setText(intent.getStringExtra(EXTRA_DEVICE_MANUF));
        deviceMac.setText(intent.getStringExtra(EXTRA_DEVICE_MAC));

    }



}