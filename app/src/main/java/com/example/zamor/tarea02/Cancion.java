package com.example.zamor.tarea02;

import android.media.MediaPlayer;

public class Cancion {
    private MediaPlayer cancion;
    private String nombre;

    public Cancion(MediaPlayer cancion, String nombre) {
        this.cancion = cancion;
        this.nombre = nombre;
    }

    public MediaPlayer getCancion() {
        return cancion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCancion(MediaPlayer cancion) {
        this.cancion = cancion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
