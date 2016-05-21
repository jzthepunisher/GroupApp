package com.soloparaapasionados.groupapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class PreferenciasActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferencias);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Preferencias");
        toolbar.inflateMenu(R.menu.menu_main);
    }


    public void onUbicacionesClick(View view) {
        Intent itemIntent = new Intent(this, UbicacionesActivity.class);
        startActivity(itemIntent);
    }

    public void onHorariosClick(View view) {
        Intent itemIntent = new Intent(this, HorariosActivity.class);
        startActivity(itemIntent);
    }

}
