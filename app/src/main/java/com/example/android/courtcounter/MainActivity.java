package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btna3, btna1, btna2;
    Button btnb3, btnb2, btnb1;
    Button btnrst;

    TextView tima, timb;

    int skora = 0;
    int skorb = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tima = (TextView) findViewById(R.id.tima);
        timb = (TextView) findViewById(R.id.timb);

        btna3 = (Button) findViewById(R.id.btna3);
        btna2 = (Button) findViewById(R.id.btna2);
        btna1 = (Button) findViewById(R.id.btna1);
        btnb1 = (Button) findViewById(R.id.btnb1);
        btnb2 = (Button) findViewById(R.id.btnb2);
        btnb3 = (Button) findViewById(R.id.btnb3);
        btnrst = (Button) findViewById(R.id.btnrst);

        btna3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                skora += 3;
                tima.setText("" + skora);
            }
        });
        btna2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                skora += 2;
                tima.setText("" + skora);
            }
        });
        btna1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                skora++;
                tima.setText("" + skora);
            }
        });
        btnb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                skorb++;
                timb.setText("" + skorb);
            }
        });
        btnb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                skorb += 2;
                timb.setText("" + skorb);
            }
        });
        btnb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                skorb += 3;
                timb.setText("" + skorb);
            }
        });
        btnrst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                skora = 0;
                skorb = 0;
                tima.setText("" + skora);
                timb.setText("" + skorb);
            }
        });
    }
}
