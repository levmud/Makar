package org.example.Lab2.adapter;

public class RoundHole {
    private double radius;
    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundStick stick) {
        boolean result;
        result = (this.getRadius() >= stick.getRadius());
        return result;
    }
}
