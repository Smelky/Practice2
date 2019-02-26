package com.smelk.immutable;

public final class Immutable {

    private final int firstValue;
    private final int secondValue;

    public Immutable(int firstValue, int secondValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
    }

    public int getFirstValue() {
        return firstValue;
    }

    public int getSecondValue() {
        return secondValue;
    }
}