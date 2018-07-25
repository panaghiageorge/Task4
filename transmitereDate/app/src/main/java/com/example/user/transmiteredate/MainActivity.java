package com.example.user.transmiteredate;

import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.EditText;



public class MainActivity extends AppCompatActivity {
    EditText etNume;
    EditText etPrenume;
    Button btnApasa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        etNume = (EditText) findViewById(R.id.etNume);
        etPrenume = (EditText) findViewById(R.id.etPrenume);
        btnApasa = (Button) findViewById(R.id.btnApasa);

        btnApasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = etNume.getText().toString().trim();
                String surname= etPrenume.getText().toString().trim();
                Intent intent = new Intent(MainActivity.this , com.example.user.transmiteredate.SecondActivity.class);
                intent.putExtra("nume", name);
                intent.putExtra("prenume", surname);
                startActivity(intent);
            }
        });
    }
}



