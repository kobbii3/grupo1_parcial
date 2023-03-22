package com.example.grupo1_parcial;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import kotlinx.coroutines.channels.ProduceKt;

public class AdaptadorPersonalizado extends RecyclerView.Adapter<AdaptadorPersonalizado.ViewHolder> {

    private ArrayList<Partido> listadoPartido;
    private OnItemClickListener onItemClickListener;

    public AdaptadorPersonalizado(ArrayList<Partido> listadoPartido){
        this.listadoPartido = listadoPartido;
        this.onItemClickListener = null;
    }

    public void setListadoPartido(ArrayList<Partido> listadoPartido){
        this.listadoPartido = listadoPartido;
        notifyDataSetChanged();
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    @NonNull
    @Override
    public AdaptadorPersonalizado.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View miview = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_detalle_partidos,parent,false);
        return new ViewHolder(miview);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorPersonalizado.ViewHolder holder, int position) {
        Partido miPartido = listadoPartido.get(position);
        holder.enlazar(miPartido);
    }

    @Override
    public int getItemCount() {
        return listadoPartido.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvNombre, tvMarcador;
        private ImageView ivEscudo;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvNombre = itemView.findViewById(R.id.tv_nombre_equipo);
            tvMarcador = itemView.findViewById(R.id.tv_marcador);
            ivEscudo = itemView.findViewById(R.id.iv_escudo);
        }

        public void enlazar(Partido miPartido){
            tvNombre.setText(miPartido.getNombreEquipo());
            tvMarcador.setText(miPartido.getMarcador());
            Picasso.get()
                    .load(miPartido.getUrlImagen())
                    .error(R.drawable.ic_launcher_background)
                    .into(ivEscudo);
        }
    }
    public interface OnItemClickListener{
        void onItemClick(Partido miPartido, int posicion);
    }
}
