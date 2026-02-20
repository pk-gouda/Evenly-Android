package com.prathikgowda.evenly;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.btnGoToScanner);

        btn.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this,ReceiptScannerActivity.class);
            startActivity(intent);
        });
    }
}