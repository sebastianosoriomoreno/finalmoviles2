package com.example.vengaamipueblo2.adaptadores;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vengaamipueblo2.R;
import com.example.vengaamipueblo2.moldes.MoldeHotel;
import com.example.vengaamipueblo2.moldes.RestauranteMolde;

import java.util.ArrayList;

public class Restaadapta  extends RecyclerView.Adapter<HotelAdaptador.viewHolder> {

    //atributos
    public ArrayList<MoldeHotel> listaRestaurantes;

    //CONSTRUCTOR

    public Restaadapta(ArrayList<RestauranteMolde>listaRestaurantess) {
        this.listaRestaurantes = listaRestaurantes;
    }

    //funcionamiento adicional
    @NonNull
    @Override
    public HotelAdaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View vista= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.molderestaurantes,null,false);
        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull HotelAdaptador.viewHolder viewHolder, int i) {
        viewHolder.actualizarDatos(listaRestaurantes.get(i));


    }

    @Override
    public int getItemCount() {
        return listaRestaurantes.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView Nombreplato;
        TextView Descripcionplato;
        TextView precioplato;
        ImageView fotorestaurante;

        public viewHolder(View item){
            super(item);
            Nombreplato=item.findViewById(R.id.);
            Descripcionplato=item.findViewById(R.id.platod);
            fotorestaurante=item.findViewById(R.id.restauranteitem);
            precioplato=item.findViewById(R.id.preciosp;
        }


        public void actualizarDatos(MoldeHotel moldeHotel) {
            fotorestaurante.setImageResource(RestauranteMolde.getFoto());
            Descripcionplato.setText(RestauranteMolde.getNombre());
            precioplato.setText(RestauranteMolde.());

        }
    }
}

