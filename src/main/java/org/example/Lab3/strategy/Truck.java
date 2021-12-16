package org.example.Lab3.strategy;

public class Truck extends Auto {
    public Truck() {
        super(new StandartFillStrategy());
    }
}
