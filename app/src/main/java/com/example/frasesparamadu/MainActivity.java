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
                "Confie no seu potêncial!",
                "Minha Princesa <3",
                "Não importa se o mundo acha clichê, Um dia vamos casar!",
                "Quero ter vários gatinhos, patinhos, cachorrinhos " +
                        "e uma cacheada para cuidarmos!",
                "Você é uma mulher maravilhosa!",
                "MUUITO GATA MEU DEUS DO CÉU",
                "Repetiria tudo de novo -> 10/01/21 <3",
                "Tenha um ótimo dia!",
                "Os meus melhores dias, tem você nele!",
                "MULHERÃO DA PO**AA!!!",
                "Vem sempre aqui???? kkkkkkk",
                "Lembra do 'hoje ta frio né?'",
                "Tenho um orgulho de você!",
                "Sou ciumento, não é todo dia que " +
                        "encontro uma mulher tão maravilhosa assim!",
                "愛してます <3",
                "Vocé é única, linda e prefeita!",
                "AMO APERTAR TEU BUXINHOOOOOO <3",
                "SEU CORPO É DIVINO E PERFEITO GAROTA!"
        };

        int number = new Random().nextInt(20); // create a random number
        TextView text = findViewById(R.id.textoResult); // find de textView
        text.setText(frasesParaGerar[number]); // set the text according array
    }
}