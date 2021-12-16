package org.example.Lab2.adapter;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestSquareStickAdapter {

    @Test
    void getRadius() {
        RoundHole hole = new RoundHole(5.0);
        SquareStick smallSquareStick = new SquareStick(5.0);
        SquareStick bigSquareStick = new SquareStick(10.0);
        SquareStickAdapter smallSquareStickAdapter = new SquareStickAdapter(smallSquareStick);
        SquareStickAdapter bigSquareStickAdapter = new SquareStickAdapter(bigSquareStick);
        boolean result1 = hole.fits(smallSquareStickAdapter);
        boolean result2 = hole.fits(bigSquareStickAdapter);
        Assert.assertEquals(true, result1);
        Assert.assertEquals(false, result2);
    }


}