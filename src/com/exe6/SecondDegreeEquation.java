package com.exe6;

public class SecondDegreeEquation {
    double a;
    double b;
    double c;

    public SecondDegreeEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void calcDelta() {
        double delta;
        double x;
        double y;

        delta = Math.pow(b, 2) - 4 * a * c;
        x = (-b + Math.sqrt(delta)) / (2 * a);
        y = (-b - Math.sqrt(delta)) / (2 * a);

        System.out.println("Delta: " + delta);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
