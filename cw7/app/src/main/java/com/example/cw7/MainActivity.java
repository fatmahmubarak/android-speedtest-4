package com.example.cw7;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<pokemon> pokeball = new ArrayList<>();
        pokemon p1 = new pokemon("bulbasaur",R.drawable.bulbasaur,49,49,318);
        pokemon p2 = new pokemon("charmander",R.drawable.charmander,52,43,309);
        pokemon p3 = new pokemon("squirtle",R.drawable.squirtle,48,65,314);
        pokemon p4 = new pokemon("rattata",R.drawable.rattata,30,56,253);
        pokemon p5 = new pokemon("beedrill",R.drawable.beedrill,65,90,395);

        pokeball.add(p1);
        pokeball.add(p2);
        pokeball.add(p3);
        pokeball.add(p4);
        pokeball.add(p5);

        RecyclerView rv = findViewById(R.id.recyclerview);
    }
    }

