package com.mycomp.ex.state;

public class TestFanSpeeds {

    public static void main(String[] args) {
        Fan fan = new Fan();

        System.out.println("Pulling chain...");
        fan.pullChain();
        System.out.println(fan + "\n");

        System.out.println("Pulling chain...");
        fan.pullChain();
        System.out.println(fan + "\n");

        System.out.println("Pulling chain...");
        fan.pullChain();
        System.out.println(fan + "\n");

        System.out.println("Pulling chain...");
        fan.pullChain();
        System.out.println(fan + "\n");

        System.out.println("Pulling chain...");
        fan.pullChain();
        System.out.println(fan + "\n");
    }
}
