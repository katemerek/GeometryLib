package com.github.katemerek.geometrylib;

public class Square implements Figure{
    int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public double getPerimeter() {
        return 4 * a;
    }
}
