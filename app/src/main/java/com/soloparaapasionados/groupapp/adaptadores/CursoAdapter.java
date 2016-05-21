package com.soloparaapasionados.groupapp.adaptadores;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.ImageView;
import android.widget.TextView;


import com.soloparaapasionados.groupapp.R;
import com.soloparaapasionados.groupapp.modelo.Curso;

import java.util.ArrayList;

/**
 * Created by USUARIO on 16/05/2016.
 */
public class CursoAdapter extends RecyclerView.Adapter<CursoAdapter.ViewHolder> {
    private ArrayList<Curso> cursos;

    public CursoAdapter(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final CheckedTextView cursoCheckedTextView;
        CardView personCard;

        public ViewHolder(View itemView) {
            super(itemView);
            personCard = (CardView) itemView.findViewById(R.id.person_card);
            cursoCheckedTextView = (CheckedTextView) itemView.findViewById(R.id.cursoCheckedTextView);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.curso_card, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.cursoCheckedTextView.setText(cursos.get(position).descripcion);
        holder.cursoCheckedTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((CheckedTextView) v).toggle();
//                if (v.isSelected())
//                {
//                    v.setSelected(false);
//                    //v.setCheckMarkDrawable (R.drawable.btn_check_off);
//                }
//                else
//                {
//                    v.setSelected(true);
//                    //v.setCheckMarkDrawable (R.drawable.btn_check_on);
//                }
            }
        });
    }


    @Override
    public int getItemCount() {
        return cursos.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

}
