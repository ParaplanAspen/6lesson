package com.company;

/**
 * test brunch
 */

public class Circle {
    private double radius; //радиус окружности
    private double circumference; //длина окружности
    private double square; //площадь окружности
    private String colour; // цвет окружности

    Circle(double rad) {
        radius = rad;
    }

    Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
        this.circumference = circumference();
        this.square = square();

    }

    private double circumference() {
        return 2 * radius * Math.PI;
    }

    private double square() {
        return Math.PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getCircumference() {
        return circumference;
    }

    public double getSquare() {
        return square;
    }

    public String getColour() {
        return colour;
    }
}

