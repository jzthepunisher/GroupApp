package com.soloparaapasionados.groupapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.soloparaapasionados.groupapp.adaptadores.CursoAdapter;
import com.soloparaapasionados.groupapp.adaptadores.UbicacionAdapter;
import com.soloparaapasionados.groupapp.modelo.Curso;
import com.soloparaapasionados.groupapp.modelo.Ubicacion;

import java.util.ArrayList;

public class UbicacionesActivity extends AppCompatActivity {
    private ArrayList<Ubicacion> ubicaciones;
    private RecyclerView mUbicacionesRecyclerView;
    private RecyclerView.Adapter mUbicacionAdapter;
    private RecyclerView.LayoutManager mUbicacionLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubicaciones);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Ubicaciones");
        toolbar.inflateMenu(R.menu.menu_registro_ubicaciones);

        inicializarData();
        mUbicacionesRecyclerView = (RecyclerView) findViewById(R.id.ubicacionesRecyclerView);
        mUbicacionesRecyclerView.setHasFixedSize(true);
        mUbicacionLayoutManager = new LinearLayoutManager(this);
        mUbicacionesRecyclerView.setLayoutManager(mUbicacionLayoutManager);
        mUbicacionAdapter = new UbicacionAdapter(ubicaciones);
        mUbicacionesRecyclerView.setAdapter(mUbicacionAdapter);


    }

    public void inicializarData() {
        ubicaciones = new ArrayList<>();
        ubicaciones.add(new Ubicacion("01", "Sede Monterrico"));
        ubicaciones.add(new Ubicacion("02", "Sede San Borja"));
        ubicaciones.add(new Ubicacion("03", "Sede San Isidro"));
        ubicaciones.add(new Ubicacion("04", "Sede San Miguel"));
        ubicaciones.add(new Ubicacion("05", "Sede Villa"));
        ubicaciones.add(new Ubicacion("06", "Campus San Miguel"));

    }
}
