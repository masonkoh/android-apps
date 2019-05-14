package com.example.intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button page1Btn = (Button) findViewById(R.id.intentBtn1);
        Button page2Btn = (Button) findViewById(R.id.intentBtn2);
        Button page3Btn = (Button) findViewById(R.id.intentBtn3);
        final Toast toast = Toast.makeText(getApplicationContext(), "Hello Toast", Toast.LENGTH_SHORT);

        page1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast.show();
            }
        });
        page2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast.show();
            }
        });
        page3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast.show();
            }
        });
    }
}
