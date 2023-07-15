package com.example.pbo_alif;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class ListViewActivity extends AppCompatActivity {

    ListView lvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        lvResult = findViewById(R.id.lvResult);

        String[][] dataNegara = new String[][]{{"Indonesia", "ASIA", "indonesia"},
                {"Malaysia", "ASIA", "malaysia"}, {"Singapore", "ASIA", "singapore"},
                {"Italia", "EROPA", "italia"}, {"Inggris", "EROPA", "inggris"},
                {"Belanda", "EROPA", "belanda"}, {"Argentina", "AMERIKA", "argentina"},
                {"Chile", "AMERIKA", "chile"}, {"Mesir", "AFRIKA", "mesir"},
                {"Uganda", "AFRIKA", "uganda"}
        };
        NegaraAdapterActivity adapter = new NegaraAdapterActivity(ListViewActivity.this, dataNegara);
        lvResult.setAdapter(adapter);
    }
}