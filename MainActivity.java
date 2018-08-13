package com.example.alan.wifi;

import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {
Button enableButton,disableButton;
TextView text;
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enableButton=(Button)findViewById(R.id.button1);
        disableButton=(Button)findViewById(R.id.button2);
    text = (TextView)findViewById(R.id.wifi_info);


    enableButton.setOnClickListener(new OnClickListener(){
        public void onClick(View v){
            WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);

            wifi.setWifiEnabled(true);
            //wifi.getConnectionInfo();
            text.setText(""+wifi.getConnectionInfo());

        }
    });

        disableButton.setOnClickListener(new OnClickListener(){
public void onClick(View v){
                WifiManager wifi = (WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
                wifi.setWifiEnabled(false);
                text.setText("");
                }
});
        }
}


