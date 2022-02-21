package com.cursoandroid.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SegundoActivity extends AppCompatActivity {

    private Button btnTerceiraActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnTerceiraActivity = findViewById(R.id.btn_terceira_activity);

        btnTerceiraActivity.setOnClickListener(view -> {

            startActivity(new Intent(this, TerceiraActivity.class));
        });

    }
}