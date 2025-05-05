package com.github.katemerek.geometryutil;

public class Rhombus {
    int a, d_1, d_2;

    public Rhombus(int a, int d_1, int d_2) {
        this.a = a;
        this.d_1 = d_1;
        this.d_2 = d_2;
    }

    public double getArea() {
        return (double) (d_1 * d_2) /2;
    }

    public double getPerimeter() {
        return 4 * a;
    }
}
