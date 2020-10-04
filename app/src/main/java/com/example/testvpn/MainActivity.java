package com.example.testvpn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Context context;
    private boolean isConnected;
    private Button connectionButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        context = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        isConnected = false;
        connectionButton = findViewById(R.id.connectionButton);
        connectionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isConnected) {
                    isConnected = false;
                    Toast.makeText(context, "Disconnected from the VPN", Toast.LENGTH_SHORT).show();
                    connectionButton.setText("Connect");
                } else {
                    isConnected = true;
                    Toast.makeText(context, "Connected to the VPN", Toast.LENGTH_SHORT).show();
                    connectionButton.setText("Disconnect");
                }
            }
        });
    }
}