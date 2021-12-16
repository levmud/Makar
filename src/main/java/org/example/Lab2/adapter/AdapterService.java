package org.example.Lab2.adapter;

public class AdapterService {
    public static void main(String[] args){
        RoundHole hole = new RoundHole(5.0);
        RoundStick roundStick = new RoundStick(5.0);
        System.out.println(hole.fits(roundStick)); // TRUE
        SquareStick smallSquareStick = new SquareStick(5.0);
        SquareStick largeSquareStick = new SquareStick(10.0);
        SquareStickAdapter smallSquareStickAdapter = new SquareStickAdapter(smallSquareStick);
        SquareStickAdapter largeSquareStickAdapter = new SquareStickAdapter(largeSquareStick);
        System.out.println(
                hole.fits(smallSquareStickAdapter)
        ); // TRUE
        System.out.println(
                hole.fits(largeSquareStickAdapter)
        ); // FALSE
    }
}
