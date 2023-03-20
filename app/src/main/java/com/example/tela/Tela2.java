package com.example.tela;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        TextView destino = findViewById(R.id.destino);
        Intent intent = getIntent();
        double imcRecebida = intent.getDoubleExtra("info", 0) * 10000;
        destino.setText(String.format("%.2f", imcRecebida));

        int[] drawables = {R.drawable.magreza, R.drawable.peso_normal, R.drawable.acima_peso, R.drawable.obesidade1, R.drawable.obesidade2};
        int drawableIndex = (imcRecebida < 18.5) ? 0 :
                            (imcRecebida < 25) ? 1 :
                            (imcRecebida < 30) ? 2 :
                            (imcRecebida < 39.9) ? 3 : 4;
        Drawable drawable = getDrawable(drawables[drawableIndex]);

        ImageView imagem = findViewById(R.id.imageView2);
        imagem.setImageDrawable(drawable);
    }
}