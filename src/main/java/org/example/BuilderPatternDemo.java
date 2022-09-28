package org.example;

public class BuilderPatternDemo {
    public static void main(String[] args) {

        MealBuilder mb = new MealBuilder();

        Meal meal1 = mb.prepareVegMeal();
        Meal meal2 = mb.prepareNonVegMeal();

        meal1.showItems();
        System.out.println("Summary: " + meal1.getCost() + "\n");

        meal2.showItems();
        System.out.println("Summary: " + meal2.getCost() + "\n");
    }
}