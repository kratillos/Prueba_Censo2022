package com.example.prueba_censo2022;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView Total;
    TextView HombreS;
    TextView MujereS;
    ImageButton BTN2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Total = (TextView) findViewById(R.id.textView8);
        HombreS = (TextView) findViewById(R.id.textView10);
        MujereS = (TextView) findViewById(R.id.textView12);
        BTN2 = (ImageButton) findViewById(R.id.Imgbtn);

        Bundle b = getIntent().getExtras();
        Integer full = b.getInt("Contador");
        Integer Men = b.getInt("Contador");
        Integer Wmen = b.getInt("Contador");

        Total.setText(""+full);
        HombreS.setText(""+Men);
        MujereS.setText(""+Wmen);

        BTN2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(I);
            }
        });
    }
}