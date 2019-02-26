package com.smelk.immutable;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Immutable immutable = new Immutable(2, 2, new Mutable());
        System.out.println(immutable.getFirstValue() + immutable.getSecondValue());
        immutable.getMutable().setFirstNumber(2);
        System.out.println(immutable.getMutable().getFirstNumber());
    }
}