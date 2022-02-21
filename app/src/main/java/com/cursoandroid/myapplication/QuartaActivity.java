package com.cursoandroid.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class QuartaActivity extends AppCompatActivity {

    EditText nome, altura, peso;
    Button botao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarta);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


    }
    public void cliqueBotao(View view ){
        altura = (EditText) findViewById(R.id.editTextAltura);
        String alturaI= altura.getText().toString();
        int alturaFinal = new Integer(alturaI).intValue()/ 100;

        peso = (EditText) findViewById(R.id.editTextPeso);
        String pesoI= altura.getText().toString();
        int pesoFinal = new Integer(pesoI).intValue();


        double imc = pesoFinal / (alturaFinal * alturaFinal);

        String mensagem = "";
        if (imc >= 18.5) {
            mensagem = "Sua Classificação é de Magreza";
        } else if (imc <= 18.5 && imc >= 24.9) ;{
            mensagem= "Sua Classificação Está Dentro do Normal";
        } if (imc <= 25.0 && imc >= 29.9) {
            mensagem= "Sua Classificação é de Sobrepeso I";
        } else if (imc <= 30.0 && imc >= 39.9) {
            mensagem= "Sua Classificação é Obesidade II";
        } else if (imc <= 40.0 ) {
            mensagem = "Sua Classificação é Obesidade Grave III";
        }

        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("IMC");
        alert.setMessage(mensagem);
        alert.setIcon(android.R.drawable.btn_dialog);

        //aqui é para colocar os botões no dialog
        alert.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(QuartaActivity.this, "alguma mensagem)", Toast.LENGTH_SHORT).show();
            }
        });
        alert.create().show();
    }
}
