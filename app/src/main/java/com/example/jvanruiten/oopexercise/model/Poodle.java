package com.example.jvanruiten.oopexercise.model;

public class Poodle extends  Dog {

    public Poodle(String breed, String color, int height) {
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
    public void bark() {

    }
}

