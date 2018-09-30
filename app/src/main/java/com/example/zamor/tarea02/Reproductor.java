package com.example.zamor.tarea02;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Reproductor extends AppCompatActivity{ //implements View.OnClickListener{
    MediaPlayer rola1;
    ImageView atras;
    ImageView iniciar;
    ImageView pausar;
    ImageView siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reproductor);

        rola1 = MediaPlayer.create(this, R.raw.rola1);
        atras = (ImageView) findViewById(R.id.atras);
        iniciar = (ImageView) findViewById(R.id.iniciar);
        pausar = (ImageView) findViewById(R.id.pausar);
        siguiente = (ImageView) findViewById(R.id.siguiente);

        rola1.start();

        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rola1.start();
            }
        });

        pausar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rola1.pause();
            }
        });

        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Reproductor.this,Reproductor3.class);
                rola1.stop();
                startActivity(intent);
            }
        });

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Reproductor.this,Reproductor2Activity.class);
                rola1.stop();
                startActivity(intent);
            }
        });
    }

    /*@Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.atras:
                Intent intent = new Intent(Reproductor.this,Reproductor3.class);
                startActivity(intent);
                rola1.stop();
                break;

        }
    }*/
}
