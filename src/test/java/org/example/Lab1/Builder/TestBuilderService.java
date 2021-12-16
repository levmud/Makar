package org.example.Lab1.Builder;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestBuilderService {

    @Test
    void exec() {
        CarBuilder builder = new CarBuilder();
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
        Car car = builder.getResult();
        Assert.assertEquals("CarType: SPORTS_CAR" + "\n" + "Seats: 2" + "\n" + "Transmission: SEMI_AUTOMATIC"  + "\n", car.toString());
    }
}