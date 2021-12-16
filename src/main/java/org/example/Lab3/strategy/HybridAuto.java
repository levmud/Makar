package org.example.Lab3.strategy;

public class HybridAuto extends Auto {

    public HybridAuto() {
        super(new HybridFillStrategy());
    }
}
