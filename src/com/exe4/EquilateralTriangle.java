package com.exe4;

public class EquilateralTriangle {
    double side;
    double perimeter;
    double area;

    public EquilateralTriangle(double side) {
        this.side = side;
    }

    void calcArea() {
        area = side * (Math.sqrt(3) / 2);
    }

    void calcPerimeter() {
        perimeter = 3 * side;
    }

    void showCalc() {
        System.out.println("Área: " + area);
        System.out.println("Perímeto: " + perimeter);
    }
}
