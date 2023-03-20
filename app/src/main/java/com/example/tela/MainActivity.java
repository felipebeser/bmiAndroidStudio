package com.example.tela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener (v -> {
            EditText altura = (EditText) findViewById(R.id.altura);
            EditText peso = (EditText) findViewById(R.id.peso);
            double alturaValor = Double.parseDouble(altura.getText().toString());
            double pesoValor = Double.parseDouble(peso.getText().toString());
            double imc = pesoValor / (alturaValor * alturaValor);

            Intent intent = new Intent(this, Tela2.class);
            intent.putExtra("info", imc);
            startActivity(intent);
            finish();
        });
    }
}