package com.smelk.builder;

public class Main {

    public static void main(String[] args) {
        Car car = new Car.Builder("Audi").brand("X5").color("Black").numOfDoors(4).maxSpeed(300).build();
    }
}