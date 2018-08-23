package com.example.jvanruiten.oopexercise.model;

import android.util.Log;

import com.example.jvanruiten.oopexercise.Bark;

public abstract class Dog implements Bark {
    String breed;
    protected String color;
    protected int height;
    protected String name;

    abstract String getBreed();

    abstract String getColor();

    abstract int getHeight();

    void feedDog(String food) {
        Log.e("food", "dog is feeded with " + food);
    }

    /*public void bark() {
        Log.e("bark", this + "barks");
    }*/
}
