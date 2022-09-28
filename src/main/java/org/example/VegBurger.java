package org.example;

public class VegBurger extends Burger{

    @Override
    public String name() {
        return "Vegetable Burger";
    }

    @Override
    public float price() {
        return 65.50f;
    }
}