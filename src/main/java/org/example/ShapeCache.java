package org.example;

import java.util.HashMap;

public class ShapeCache {
    private static HashMap<String, Shape> shapeMap = new HashMap<>();

    public static void loadCache() {
        Circle c = new Circle();
        c.setId("1");
        shapeMap.put(c.getId(), c);

        Rectangle r = new Rectangle();
        r.setId("2");
        shapeMap.put(r.getId(), r);

        Square s = new Square();
        s.setId("3");
        shapeMap.put(s.getId(), s);

        Rectangle r1 = new Rectangle();
        r1.setId("4");
        shapeMap.put(r1.getId(), r1);
    }

    public static Shape getShape(String shapeId) {
        Shape shape = shapeMap.get(shapeId);
        return (Shape) shape.clone();
    }
}