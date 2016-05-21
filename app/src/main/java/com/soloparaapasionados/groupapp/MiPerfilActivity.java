package com.soloparaapasionados.groupapp;

import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class MiPerfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mi_perfil);

        setToolbar();// Añadir action bar
        if (getSupportActionBar() != null) // Habilitar up button
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String name = "Arturo Marrufo Vega";
        CollapsingToolbarLayout collapser = (CollapsingToolbarLayout) findViewById(R.id.collapsingToolbar);
        collapser.setTitle(name); // Cambiar título

        loadImageParallax(R.drawable.farruko);// Cargar Imagen

    }

    public void onPreferenciasClick(View view) {
        Intent itemIntent = new Intent(view.getContext(), PreferenciasActivity.class);
        startActivity(itemIntent);
    }

    private void setToolbar() {
        // Añadir la Toolbar
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        toolbar.setTitle("Mi Perfil");
//        toolbar.setSubtitle("Arturo Marrufo Vega");
    //    toolbar.inflateMenu(R.menu.menu_registro_curso);
        setSupportActionBar(toolbar);
    }

    /**
     * Se carga una imagen aleatoria para el detalle
     */
    private void loadImageParallax(int id) {
        ImageView image = (ImageView) findViewById(R.id.image_paralax);
        image.setImageResource(id);
        // Usando Glide para la carga asíncrona
//        Glide.with(this)
//                .load(id)
//                .centerCrop()
//                .into(image);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_registro_curso, menu);
        return true;
    }
}
