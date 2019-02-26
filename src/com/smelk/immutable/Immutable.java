package com.smelk.immutable;

public final class Immutable {

    private final int firstValue;
    private final int secondValue;
    private final Mutable mutable;

    public Immutable(int firstValue, int secondValue, Mutable mutable) throws CloneNotSupportedException {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.mutable = (mutable != null ? (Mutable) mutable.clone() : new Mutable(0, 0));
    }

    public int getFirstValue() {
        return firstValue;
    }

    public int getSecondValue() {
        return secondValue;
    }

    public Mutable getMutable(){
        Mutable clone = null;
        try {
            clone =  (Mutable) mutable.clone();
        }catch (CloneNotSupportedException e) {
            System.out.println(e.getMessage());
        }
        return clone;
    }
}