package com.example.jvanruiten.oopexercise.model;

import android.util.Log;

public class Labrador extends Dog {

    public Labrador(String breed, String color, int height) {
        super.breed = breed;
        super.color = color;
        super.height = height;
    }

    @Override
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    void feedDog(String food) {
        super.feedDog(food);
        Log.e("food", "Labrador is feeded with " + food);
    }

    @Override
    public void bark() {
        Log.e("bark", "Labrador barks");
    }
}
