package com.example.wapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleText(View v){
        TextView t = findViewById(R.id.source);
        String input = t.getText().toString();
        ((TextView)findViewById(R.id.changed)).setText(input);
        Toast.makeText(this,"Welcome "+ input, Toast.LENGTH_LONG).show();
    }
}