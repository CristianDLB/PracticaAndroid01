package com.example.practicaandroid01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.practicaandroid01.Adaptadores.ContactosA;
import com.example.practicaandroid01.Entidades.ContactosN;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<ContactosN> cont = getContactos();
        ContactosA adaptador = new ContactosA(cont);

        RecyclerView rv = findViewById(R.id.ContactoRv);
        rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        rv.setHasFixedSize(true);

        rv.setAdapter(adaptador);

    }
    private List<ContactosN> getContactos(){
        List<ContactosN> contacto = new ArrayList<>();
        contacto.add(new ContactosN("Keriann O'Lenechan","646 515 2182"));
        contacto.add(new ContactosN("Odette Perel","920 692 3791"));
        contacto.add(new ContactosN("Clemente Guile","885 564 3244"));
        contacto.add(new ContactosN("Eva Caren","862 128 0186"));
        contacto.add(new ContactosN("Tommie Rosina","754 519 3703"));
        contacto.add(new ContactosN("Coretta Alred","801 591 8160"));
        contacto.add(new ContactosN("Brook Fredi","528 506 8502"));
        contacto.add(new ContactosN("Jobey Sabathier","581 676 9164"));
        return contacto;
    }






}