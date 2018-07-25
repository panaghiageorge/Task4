package com.example.user.transmiteredate;


import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity   extends AppCompatActivity {
    TextView tvDate;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.seconde_main);

        tvDate=(TextView) findViewById(R.id.tvDate);
        String name=getIntent().getStringExtra("nume");
        String surname =getIntent().getStringExtra("prenume");
        tvDate.setText(name+" "+surname);




    }


}
