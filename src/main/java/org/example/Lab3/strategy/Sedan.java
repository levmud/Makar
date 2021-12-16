package org.example.Lab3.strategy;

public class Sedan extends Auto {
    public Sedan() {
        super(new StandartFillStrategy());
    }
}
