package com.smelk.immutable;

public final class Immutable {

    private final int firstValue;
    private final int secondValue;
    private final Mutable mutable;

    public Immutable(int firstValue, int secondValue, Mutable mutable) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.mutable = mutable;
    }

    public int getFirstValue() {
        return firstValue;
    }

    public int getSecondValue() {
        return secondValue;
    }

    public Mutable getMutable() throws CloneNotSupportedException {
        return (Mutable) mutable.clone();
    }
}