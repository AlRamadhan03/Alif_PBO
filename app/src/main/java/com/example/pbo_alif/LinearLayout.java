package com.example.pbo_alif;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LinearLayout extends AppCompatActivity {

    Button tampilkan;
    EditText nama, alamat;
    TextView hasil;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout);

        tampilkan = findViewById(R.id.btntampilkan);
        nama =  findViewById(R.id.edtnama);
        alamat = findViewById(R.id.edtalamat);
        hasil = findViewById(R.id.txthasil);

        tampilkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hasil.setText("Hello Nama Saya " + nama.getText().toString()
                        + " dan Alamat Saya di " + alamat.getText().toString());
            }
        });

    }
}