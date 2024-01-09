package com.example.loginapplicationwithfurthercoding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTextUsername = findViewById(R.id.username);
        EditText editTextPassword = findViewById(R.id.password);
        Button buttonLogin = findViewById(R.id.login);

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username  = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();


                if(username.equals("Admin") && password.equals("1234")){
                    Toast.makeText(MainActivity.this, "Login Successful",Toast.LENGTH_LONG).show();
                }else{

                    Toast.makeText(MainActivity.this, "Wrong Username/Password",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}