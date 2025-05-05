package com.github.katemerek.geometrylib;

public class Rectangle implements Figure{
    int a, b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }
}

