package online.cyberforensic.wirelessscannerandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvWelcomeMessage;
    Button btnGetAP,btnGetClient,btnGetOther;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tvWelcomeMessage = findViewById(R.id.welcomeMessage);
        btnGetAP = findViewById(R.id.btnAP);
        btnGetClient = findViewById(R.id.btnClient);
        btnGetOther = findViewById(R.id.btnOther);
    }
}