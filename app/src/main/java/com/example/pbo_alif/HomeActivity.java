package com.example.pbo_alif;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    Button linear, relative, login, view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        linear = findViewById(R.id.btnLinear);
        relative = findViewById(R.id.btnRelative);
        login = findViewById(R.id.btnLogin);
        view = findViewById(R.id.btnView);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent View = new Intent(HomeActivity.this, LinearLayout.class);
                startActivity(View);
            }
        });

        linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent linearlayout = new Intent(HomeActivity.this, LinearLayout.class);
                startActivity(linearlayout);
            }
        });
        relative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent relativelayout = new Intent(HomeActivity.this, RelativeLayout.class);
                startActivity(relativelayout);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menulogin = new Intent(HomeActivity.this, LoginActivity.class);
                startActivity(menulogin);
            }
        });
    }
}