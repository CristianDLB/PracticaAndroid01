package com.example.practicaandroid01.Adaptadores;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.practicaandroid01.Entidades.ContactosN;
import com.example.practicaandroid01.R;

import java.util.List;

public class ContactosA extends RecyclerView.Adapter<ContactosA.ContactoHolder> {

    List<ContactosN> contacto;
    public ContactosA(List<ContactosN> contacto){
        this.contacto = contacto;
    }

    @NonNull
    @Override
    public ContactoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vista = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_contactos,parent,false);
        ContactoHolder h = new ContactoHolder(vista);
        return h;
    }

    @Override
    public void onBindViewHolder(@NonNull ContactoHolder holder, int position) {
        ContactosN contac =  contacto.get(position);
        TextView TvNombres = holder.itemView.findViewById(R.id.viContacto);
        TextView TvNumeros = holder.itemView.findViewById(R.id.viNumeros);

        TvNombres.setText(contac.nombre);
        TvNumeros.setText(contac.numero);

        Button Boton1 = holder.itemView.findViewById(R.id.BnLlamar);
        Boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Context context = v.getContext();
                final Intent intent = new  Intent(Intent.ACTION_DIAL);
                context.startActivity(intent);
            }
        });

        Button Boton2 = holder.itemView.findViewById(R.id.BnMensajes);
        Boton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Context context = v.getContext();
                //final Intent intent = new  Intent(Intent.ACTION_SEND);
                //context.startActivity(intent);

            }
        });


    }

    @Override
    public int getItemCount() {
        return contacto.size();
    }

    class ContactoHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        public ContactoHolder(@NonNull View itemView) {
            super(itemView);
        }
        @Override
        public void onClick(View view) {

        }


    }
}
