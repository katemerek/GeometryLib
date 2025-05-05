package com.github.katemerek.geometrylib;

public class Square implements Figure{
    int a;
    @Override
    public double getArea() {
        return a * a;
    }

    @Override
    public double getPerimeter() {
        return 4 * a;
    }
}
