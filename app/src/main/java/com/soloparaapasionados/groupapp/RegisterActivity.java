package com.soloparaapasionados.groupapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Registro");
        toolbar.inflateMenu(R.menu.menu_main);
    }

    public void continuar_Click(View view) {

        Intent intent = new Intent(RegisterActivity.this, RegisterCourseActivity.class);
        startActivity(intent);
    }

}
