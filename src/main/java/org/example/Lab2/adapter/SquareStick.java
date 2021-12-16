package org.example.Lab2.adapter;

public class SquareStick {
    private double width;

    public SquareStick(double width) {
        this.width = width;
    }
    public double getWidth() {
        return width;
    }
    public double getSquare() {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }

}
