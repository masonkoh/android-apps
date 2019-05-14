package com.example.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Button page1Btn = (Button) findViewById(R.id.intentBtn1);

        final Toast toast = Toast.makeText(getApplicationContext(), "Going back to main", Toast.LENGTH_SHORT);
        final Intent intent = new Intent(Main4Activity.this, MainActivity.class);


        page1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast.show();
                startActivity(intent);

            }
        });
    }
}
