package com.example.zamor.tarea02;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Reproductor2Activity extends AppCompatActivity {
    MediaPlayer rola2;
    ImageView atras;
    ImageView iniciar;
    ImageView pausar;
    ImageView siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reproductor2);

        rola2 = MediaPlayer.create(this, R.raw.rola2);


        atras = (ImageView) findViewById(R.id.atras);
        iniciar = (ImageView) findViewById(R.id.iniciar);
        pausar = (ImageView) findViewById(R.id.pausar);
        siguiente = (ImageView) findViewById(R.id.siguiente);

        rola2.start();

        iniciar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rola2.start();
            }
        });

        pausar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rola2.pause();
            }
        });

        atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Reproductor2Activity.this, Reproductor.class);
                rola2.stop();
                startActivity(intent);
            }
        });

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Reproductor2Activity.this, Reproductor3.class);
                rola2.stop();
                startActivity(intent);
            }
        });
    }
}
