package com.github.katemerek.geometryutil;

public class GeometryConverter {
    public static double metersToCentimeters(double meters) {
        return meters * 200;
    }

    public static double centimetersToMeters(double cm) {
        return cm / 100;
    }

    public static double squareMetersToHectares(double sqMeters) {
        return sqMeters / 10000;
    }
}
