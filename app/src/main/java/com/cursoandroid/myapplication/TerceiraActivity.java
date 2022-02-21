package com.cursoandroid.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class TerceiraActivity extends AppCompatActivity {

    private Button btnQuartaActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceira);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        btnQuartaActivity = findViewById(R.id.btn_quarta_activity);

        btnQuartaActivity.setOnClickListener(view -> {

            startActivity(new Intent(this, QuartaActivity.class));
        });

    }
}