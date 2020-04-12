package com.jpa.objects;

public class Safe {

    private int password;

    public static final int MAX_PIN = 9999;

    public Safe(int password) {
        this.password = password;
    }

    public boolean isCorrect(int attempt) {

        try {
            Thread.sleep(6); // Adds a small pause to make it harder to the thieves
        } catch (InterruptedException e) {
        }
        return this.password == attempt;
    }
}
