package com.company;

public class Pizzeria {
    public static void main(String[] args) {
      Pizza villagePizza = new Pizza("мясо, сыр, оливки, соус","Village",150,30);
      Pizza [] list= {
              new Pizza("мясо, сыр, оливки, соус","Village",150,30),
              villagePizza,
              new Pizza("мясо, сыр, оливки, соус, двойной сыр","Mozarella",180,40),
              new Pizza("мясо, сыр, оливки, соус, острый перец","Hot",200,50),
      };
        for (int i = 0; i < list.length; i++) {
            Pizza item=list[i];
            System.out.println(item.getName());
        }

    }
}
