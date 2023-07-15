package com.example.pbo_alif;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText username, password;
    Button login;
    TextView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.txt_username);
        password = findViewById(R.id.txt_password);
        login = findViewById(R.id.button);
        signup = findViewById(R.id.signup_req);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equalsIgnoreCase("Alif Athillah Ramadhan")
                        && password.getText().toString().equalsIgnoreCase("Alif")) {
                    Toast.makeText(LoginActivity.this, "Anda berhasil Login", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(LoginActivity.this, "Username atau Password Anda salah", Toast.LENGTH_SHORT).show();
                }
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent register = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(register);
            }
        });
    }
}