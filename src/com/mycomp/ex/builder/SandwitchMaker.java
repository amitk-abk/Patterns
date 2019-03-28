package com.mycomp.ex.builder;

public class SandwitchMaker {

    public static void main(String[] args) {
        Condiments.Builder builder = new Condiments.Builder();
        builder.addBread("bread").addCondiment("condiment").addLettuce("lettuce").addTopping("topping");
        Condiments condiments = builder.build();
        System.out.println(condiments);

        Condiments.Builder builder1 = new Condiments.Builder();
        builder1.addBread("bread").addCondiment("").addLettuce("lettuce").addTopping("topping");
        Condiments condiments1 = builder1.build();
        System.out.println(condiments1);

        System.out.println(builder == builder1);
    }
}

