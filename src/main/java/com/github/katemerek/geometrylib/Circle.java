package com.github.katemerek.geometrylib;

public class Circle implements Figure {

    private final int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.sqrt(radius);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
