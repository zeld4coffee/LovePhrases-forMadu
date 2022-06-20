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

        String[] frasesParaGerar = { // phrases array
                "Eu te amo muito, não se esqueça disso <3",
                "Você é maravilhosa <3",
                "Confie no seu potencial!",
                "Minha Princesa <3",
                "Não importa se o munda acha clichê, Um dia vamos casar!",
        };

        int number = new Random().nextInt(4); // create a random number
        TextView text = findViewById(R.id.textoResult); // find de textView
        text.setText(frasesParaGerar[number]); // set the text acording array
    }
}