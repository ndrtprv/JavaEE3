package org.example;

import java.util.ArrayList;

public class Meal {
    private ArrayList<Item> items;

    public void addItem(Item item) {
        if (items == null) {
            items = new ArrayList<>();
        }
        if (item != null) {
            items.add(item);
        } else {
            throw new NullPointerException("There's no drink/burger!");
        }
    }

    public float getCost() {
        float result = 0;
        for (Item item : items) {
            result += item.price();
        }
        return result;
    }

    public void showItems() {
        int i = 1;
        for (Item item : items) {
            System.out.println("Item " + i + ": " + item.name());
            System.out.println("Packing: " + item.packing().pack());
            System.out.println("Price: " + item.price());
            i++;
        }
    }
}