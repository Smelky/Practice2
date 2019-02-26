package com.smelk.classes.types.anonymous;

public class Anonymous {

    public void Anonymous(int firestValue, int secondValue) {

        AnonymousTest anonymousInterface = new AnonymousTest() {

            @Override
            public void Addition() {
                System.out.println(firestValue + secondValue);
            }
        };
        anonymousInterface.Addition();
    }
}