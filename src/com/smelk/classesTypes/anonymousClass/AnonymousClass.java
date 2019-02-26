package com.smelk.classesTypes.anonymousClass;

public class AnonymousClass {

    public void Anonymous(int firestValue, int secondValue) {

        AnonymousInterface anonymousInterface = new AnonymousInterface() {

            @Override
            public void Addition() {
                System.out.println(firestValue + secondValue);
            }
        };
        anonymousInterface.Addition();
    }
}