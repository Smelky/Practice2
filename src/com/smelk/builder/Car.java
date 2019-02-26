package com.smelk.builder;

public class Car {

    private final String name;
    private final String brand;
    private final String color;
    private final int numOfDoors;
    private final int maxSpeed;

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    private Car(Builder builder) {
        this.name = builder.name;
        this.brand = builder.brand;
        this.color = builder.color;
        this.numOfDoors = builder.numOfDoors;
        this.maxSpeed = builder.maxSpeed;

    }

    static class Builder {
        private String name;
        private String brand;
        private String color;
        private int numOfDoors;
        private int maxSpeed;

        public Builder(String name) {
            this.name = name;
        }

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder numOfDoors(int numOfDoors) {
            this.numOfDoors = numOfDoors;
            return this;
        }

        public Builder maxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}