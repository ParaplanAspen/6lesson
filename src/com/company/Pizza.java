package com.company;

public class Pizza {
   private Circle basic;
   private String composition;
   private String name;
   private double price;
   private double dianeter;

    public Pizza(String composition, String name, double price, double dianeter) {
        this.composition = composition;
        this.name = name;
        this.price = price;
        this.dianeter = dianeter;
        this.basic=new Circle(dianeter/2);
    }

    public String getComposition() {
        return composition;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getDianeter() {
        return dianeter;
    }
}

