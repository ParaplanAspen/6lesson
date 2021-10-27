package com.company;

public class Main {

    public static void main(String[] args) {
        Circle newObject = new Circle(12, "white");
        System.out.println("Длина окружности равна" + " " + newObject.getCircumference());
        System.out.println("Площадь окружности" + " " + newObject.getSquare());
        System.out.println("Цветокружности " + " " + newObject.getColour());

    }
}
