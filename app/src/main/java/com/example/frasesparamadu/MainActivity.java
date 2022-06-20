package com.example.frasesparamadu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view) {

        String[] frasesParaGerar = {
                "frase1",
                "aaaa",
                "bbb",

        };

        int number = new Random().nextInt(4);

        TextView text = findViewById(R.id.textoResult);
        text.setText(frasesParaGerar[number]);

    }
}