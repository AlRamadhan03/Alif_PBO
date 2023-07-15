package com.example.pbo_alif;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class RelativeLayout extends AppCompatActivity {

        TextView prov;
        Spinner provinsi;
        Button tombol;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_relative_layout);

            provinsi = findViewById(R.id.provinsi);
            tombol = findViewById(R.id.tombol);
            tombol.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(RelativeLayout.this,
                            "Pilihan"+ provinsi.getSelectedItem().toString(),
                            Toast.LENGTH_SHORT).show();
                }
            });
        }

    }