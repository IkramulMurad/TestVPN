package com.example.testvpn;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private boolean isConnected = false;
    final Button connectionButton = findViewById(R.id.connectionButton);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connectionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isConnected) {
                    Toast.makeText(getApplicationContext(), "Connected to the VPN", Toast.LENGTH_LONG).show();
                    connectionButton.setText("Disconnect");
                } else {
                    Toast.makeText(getApplicationContext(), "Disconnected from the VPN", Toast.LENGTH_LONG).show();
                    connectionButton.setText("Connect");
                }
            }
        });
    }
}