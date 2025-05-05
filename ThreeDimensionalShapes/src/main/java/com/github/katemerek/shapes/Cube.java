package com.github.katemerek.shapes;

public class Cube implements Figure3D {
    private int a;

    public Cube(int a) {
        this.a = a;
    }

    @Override
    public double getVolume() {
        return Math.pow(a, 3);
    }

    @Override
    public double getSurfaceArea() {
        return 6 * Math.pow(a, 2);
    }
}
