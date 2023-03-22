package com.example.grupo1_parcial;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Partido> listaPrincipalPartidos;
    private RecyclerView rvListadoPartidos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //setTitle(getString(R.string.txt_listadoPartidos));

        cargarDatos();

        rvListadoPartidos = findViewById(R.id.rv_listado_partidos);

        AdaptadorPersonalizado miAdaptador = new AdaptadorPersonalizado(listaPrincipalPartidos);

        rvListadoPartidos.setAdapter(miAdaptador);
        rvListadoPartidos.setLayoutManager(new LinearLayoutManager(this));

    }

    public void cargarDatos(){
        Partido partido1 = new Partido();
        partido1.setNombreEquipo("Venezuela");
        partido1.setUrlImagen("https://as00.epimg.net/img/comunes/fotos/fichas/equipos/large/2930.png");
        partido1.setMarcador("3-5");

        Partido partido2 = new Partido();
        partido2.setNombreEquipo("Croacia");
        partido2.setUrlImagen("https://as01.epimg.net/img/comunes/fotos/fichas/equipos/large/1885.png");
        partido2.setMarcador("2-2");

        Partido partido3 = new Partido();
        partido3.setNombreEquipo("Jamaica");
        partido3.setUrlImagen("https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/Jamaica_FA.svg/1200px-Jamaica_FA.svg.png");
        partido3.setMarcador("2-0");

        Partido partido4 = new Partido();
        partido4.setNombreEquipo("España");
        partido4.setUrlImagen("https://i.pinimg.com/originals/c3/12/d8/c312d830c69d8e795045a2e7cc43d025.png");
        partido4.setMarcador("7-0");

        Partido partido5 = new Partido();
        partido5.setNombreEquipo("Argentina");
        partido5.setUrlImagen("https://cdn.worldvectorlogo.com/logos/argentina-national-football-team-logo.svg");
        partido5.setMarcador("3-3");

        listaPrincipalPartidos = new ArrayList<>();
        listaPrincipalPartidos.add(partido1);
        listaPrincipalPartidos.add(partido2);
        listaPrincipalPartidos.add(partido3);
        listaPrincipalPartidos.add(partido4);
        listaPrincipalPartidos.add(partido5);
    }
}