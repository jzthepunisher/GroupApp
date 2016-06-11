package com.soloparaapasionados.groupapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.CheckedTextView;

import com.soloparaapasionados.groupapp.adaptadores.CursoAdapter;
import com.soloparaapasionados.groupapp.modelo.Curso;

import java.util.ArrayList;

public class RegisterCourseActivity extends AppCompatActivity {

    private ArrayList<Curso> cursos;
    private RecyclerView mCursosRecyclerView;
    private RecyclerView.Adapter mPeopleAdapter;
    private RecyclerView.LayoutManager mPeopleLayoutManager;

    CheckedTextView cursoCheckedTextView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_course);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Registro");
        toolbar.inflateMenu(R.menu.menu_registro_curso);

        inicializarData();
        mCursosRecyclerView = (RecyclerView) findViewById(R.id.cursosRecyclerView);
        mCursosRecyclerView.setHasFixedSize(true);
        mPeopleLayoutManager = new LinearLayoutManager(this);
        mCursosRecyclerView.setLayoutManager(mPeopleLayoutManager);
        mPeopleAdapter = new CursoAdapter(cursos);
        mCursosRecyclerView.setAdapter(mPeopleAdapter);

    }


    public void inicializarData() {

        cursos = new ArrayList<>();
        cursos.add(new Curso("01", "Calculo 1","nombre 1 ",2));
        cursos.add(new Curso("01", "Calculo 2","nombre 1 ",2));
        cursos.add(new Curso("01", "Matematica Basica","nombre 1 ",2));
        cursos.add(new Curso("01", "Fisica 1","nombre 1 ",2));
        cursos.add(new Curso("01", "Fisica 2","nombre 1 ",2));

    }




}
