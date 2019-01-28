package com.example.layoutingme;

import android.app.FragmentManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class SingUpActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    Button btnBack;
    Spinner spKota;
    TextView tvPilih;
    private String[] lisKota = {
            "-Pilih-", "Jakarta", "Semarang", "Bandung", "Surabaya", "Yogyakarta", "Denpasar", "Padang"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);
        btnBack = findViewById(R.id.buttonback);
        btnBack.setOnClickListener(this);
        tvPilih = findViewById(R.id.tv_pilih);
        spKota = findViewById(R.id.sp_kota);

        ArrayAdapter<String> adapter = new ArrayAdapter(this, android.R.layout.simple_spinner_item, lisKota);
        spKota.setAdapter(adapter);
        spKota.setOnItemSelectedListener(this);


    }

    @Override
    public void onClick(View v) {
startActivity(new Intent(SingUpActivity.this, LoginActivity.class));
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        tvPilih.setText(lisKota[position]);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        tvPilih.setText("");

    }
}
