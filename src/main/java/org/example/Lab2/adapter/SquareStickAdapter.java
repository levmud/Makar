package org.example.Lab2.adapter;


public class SquareStickAdapter extends RoundStick{
    private SquareStick stick;

    public SquareStickAdapter(SquareStick stick) {
        this.stick = stick;
    }

    @Override
    public double getRadius() {
        double result;
        // Рассчитываем минимальный радиус, в который пролезет этот колышек.
        result = (Math.sqrt(Math.pow((stick.getWidth() / 2), 2) * 2));
        return result;
    }
}
