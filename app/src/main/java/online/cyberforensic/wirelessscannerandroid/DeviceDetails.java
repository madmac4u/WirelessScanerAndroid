package online.cyberforensic.wirelessscannerandroid;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static online.cyberforensic.wirelessscannerandroid.BackgroundTask.EXTRA_DEVICE_MAC;
import static online.cyberforensic.wirelessscannerandroid.BackgroundTask.EXTRA_DEVICE_MANUF;
import static online.cyberforensic.wirelessscannerandroid.BackgroundTask.EXTRA_DEVICE_NAME;
import static online.cyberforensic.wirelessscannerandroid.BackgroundTask.EXTRA_DEVICE_SIGNAL;
import static online.cyberforensic.wirelessscannerandroid.BackgroundTask.EXTRA_DEVICE_TYPE;

public class DeviceDetails extends AppCompatActivity {

    TextView deviceType,deviceName,deviceManuf,deviceMac,deviceSignal;
    RelativeLayout deviceDetailsLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.getSupportActionBar().hide();
        setContentView(R.layout.activity_device_details);
        deviceType = findViewById(R.id.deviceType);
        deviceName = findViewById(R.id.deviceName);
        deviceManuf = findViewById(R.id.deviceManuf);
        deviceMac = findViewById(R.id.deviceMac);
        deviceSignal = findViewById(R.id.deviceSignal);
        deviceDetailsLayout = findViewById(R.id.deviceDetailsLayout);


        Intent intent = getIntent();

        deviceType.setText(intent.getStringExtra(EXTRA_DEVICE_TYPE));
        deviceName.setText(intent.getStringExtra(EXTRA_DEVICE_NAME));
        deviceManuf.setText(intent.getStringExtra(EXTRA_DEVICE_MANUF));
        deviceMac.setText(intent.getStringExtra(EXTRA_DEVICE_MAC));
        deviceSignal.setText(intent.getStringExtra(EXTRA_DEVICE_SIGNAL));

    }



}