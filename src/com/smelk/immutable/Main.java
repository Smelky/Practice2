package com.smelk.immutable;

public class Main {

    public static void main(String[] args) {
        Immutable immutable = new Immutable(2, 2);
        System.out.println(immutable.getFirstValue() + immutable.getSecondValue());
    }
}