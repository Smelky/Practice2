package com.smelk.builder;

public class Main {

    public static void main(String[] args) {
        Car car = new Car.Builder("Audi").setBrand("X5").setColor("Black").setNumOfDoors(4).setMaxSpeed(300).build();
    }
}