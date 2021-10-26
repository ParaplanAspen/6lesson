package com.company;

/**
 * test brunch
 */

public class Circle {
    double radius; //радиус окружности
    double circumference; //длина окружности
    double square; //площадь окружности
    String colour; // цвет окружности
    Circle (double rad) {
        radius=rad;
    }

    Circle (double radi, String col) {
        radius = radi;
        colour = col;

    }
    double circumference(){
        return 2*radius*Math.PI;
    }
    double square(){
        return Math.PI*radius*radius;
    }
// test1
    public static void main(String[] args) {
        Circle newObject=new Circle(12,"white");
        double circumference;
        double square;
        String colour;
        circumference=newObject.circumference();
        square=newObject.square();
        colour=newObject.colour;
        System.out.println("Длина окружности равна"+" "+circumference );
        System.out.println("Площадь окружности"+" "+square );
        System.out.println("Цветокружности "+" "+colour );

    }

}

