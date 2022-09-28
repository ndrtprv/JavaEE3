package org.example;

public class PrototypePatternDemo {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape cShape1 = (Shape) ShapeCache.getShape("1");
        System.out.println("Type of shape " + cShape1.getId() + ": " + cShape1.getType());

        Shape cShape2 = (Shape) ShapeCache.getShape("4");
        System.out.println("Type of shape " + cShape2.getId() + ": " + cShape2.getType());

        Shape cShape3 = (Shape) ShapeCache.getShape("3");
        System.out.println("Type of shape " + cShape3.getId() + ": " + cShape3.getType());
    }
}