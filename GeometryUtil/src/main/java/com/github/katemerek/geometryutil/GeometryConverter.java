package com.github.katemerek.geometryutil;

public class GeometryConverter {
    public static double metersToCentimeters(double meters) {
        return meters * 100;
    }

    public static double centimetersToMeters(double cm) {
        return cm / 100;
    }

    public static double squareMetersToHectares(double sqMeters) {
        return sqMeters / 10000;
    }

    public static double metersToKilometers(double meters) {
        return meters / 1000;
    }
    public static double centimetersToKilometers(double cm) {
        return cm / 100000;
    }
}
