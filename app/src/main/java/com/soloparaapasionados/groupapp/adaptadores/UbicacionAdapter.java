package com.soloparaapasionados.groupapp.adaptadores;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;

import com.soloparaapasionados.groupapp.R;
import com.soloparaapasionados.groupapp.modelo.Curso;
import com.soloparaapasionados.groupapp.modelo.Ubicacion;

import java.util.ArrayList;

/**
 * Created by USUARIO on 17/05/2016.
 */
public class UbicacionAdapter extends RecyclerView.Adapter<UbicacionAdapter.ViewHolder> {
    private ArrayList<Ubicacion> ubicaciones;

    public UbicacionAdapter(ArrayList<Ubicacion> ubicaciones) {
        this.ubicaciones = ubicaciones;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final CheckedTextView ubicaciconCheckedTextView;
        CardView ubicacionCard;

        public ViewHolder(View itemView) {
            super(itemView);
            ubicacionCard = (CardView) itemView.findViewById(R.id.person_card);
            ubicaciconCheckedTextView = (CheckedTextView) itemView.findViewById(R.id.ubicacionRecyclerView);
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ubicacion_card, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.ubicaciconCheckedTextView.setText(ubicaciones.get(position).descripcion);
        holder.ubicaciconCheckedTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((CheckedTextView) v).toggle();
//                if (v.isSelected()) {
//                    v.setSelected(false);
//                    //v.setCheckMarkDrawable (R.drawable.btn_check_off);
//                } else {
//                    v.setSelected(true);
//                    //v.setCheckMarkDrawable (R.drawable.btn_check_on);
//                }
            }
        });
    }


    @Override
    public int getItemCount() {
        return ubicaciones.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

}
