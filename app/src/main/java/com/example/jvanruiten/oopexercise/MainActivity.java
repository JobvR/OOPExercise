package com.example.jvanruiten.oopexercise;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.jvanruiten.oopexercise.adapters.RecyclerViewAdapter;
import com.example.jvanruiten.oopexercise.model.Dog;
import com.example.jvanruiten.oopexercise.model.Labrador;
import com.example.jvanruiten.oopexercise.model.Bulldog;
import com.example.jvanruiten.oopexercise.model.Poodle;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public ArrayList<String> dogNames = new ArrayList<>();
    public ArrayList<String> dogBreeds = new ArrayList<>();
    public ArrayList<String> dogColors = new ArrayList<>();
    public ArrayList<Integer> dogHeights = new ArrayList<>();
    public Labrador amber;
    public Labrador beau;
    public Labrador cyra;
    public Bulldog darryl;
    public Bulldog elliot;
    public Bulldog fido;
    public Poodle george;
    public Poodle harry;
    public Poodle isabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        createDogs();
        addDogs();

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(dogNames, dogBreeds, dogColors, dogHeights);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
    public void createDogs(){
        amber = new Labrador("Labrador", "Blond", 105);
        amber.setName("Amber");
        beau = new Labrador("Labrador", "Black", 95);
        beau.setName("Beau");
        cyra = new Labrador("Labrador", "Brown", 100);
        cyra.setName("Cyra");

        darryl = new Bulldog("Bulldog", "Grey", 35);
        darryl.setName("Darryl");
        elliot = new Bulldog("Bulldog", "Black and white", 40);
        elliot.setName("Elliot");
        fido = new Bulldog("Bulldog", "Brown", 37);
        fido.setName("Fido");

        george = new Poodle("Poodle", "White", 35);
        george.setName("George");
        harry = new Poodle("Poodle", "Black", 40);
        harry.setName("Harry");
        isabel = new Poodle("Poodle", "Pink", 37);
        isabel.setName("Isabel");
    }
    public void addDogs(){
        dogNames.add(amber.getName());
        dogNames.add(beau.getName());
        dogNames.add(cyra.getName());
        dogNames.add(darryl.getName());
        dogNames.add(elliot.getName());
        dogNames.add(fido.getName());
        dogNames.add(george.getName());
        dogNames.add(harry.getName());
        dogNames.add(isabel.getName());

        dogBreeds.add(amber.getBreed());
        dogBreeds.add(beau.getBreed());
        dogBreeds.add(cyra.getBreed());
        dogBreeds.add(darryl.getBreed());
        dogBreeds.add(elliot.getBreed());
        dogBreeds.add(fido.getBreed());
        dogBreeds.add(george.getBreed());
        dogBreeds.add(harry.getBreed());
        dogBreeds.add(isabel.getBreed());

        dogColors.add(amber.getColor());
        dogColors.add(beau.getColor());
        dogColors.add(cyra.getColor());
        dogColors.add(darryl.getColor());
        dogColors.add(elliot.getColor());
        dogColors.add(fido.getColor());
        dogColors.add(george.getColor());
        dogColors.add(harry.getColor());
        dogColors.add(isabel.getColor());

        dogHeights.add(amber.getHeight());
        dogHeights.add(beau.getHeight());
        dogHeights.add(cyra.getHeight());
        dogHeights.add(darryl.getHeight());
        dogHeights.add(elliot.getHeight());
        dogHeights.add(fido.getHeight());
        dogHeights.add(george.getHeight());
        dogHeights.add(harry.getHeight());
        dogHeights.add(isabel.getHeight());
    }
}