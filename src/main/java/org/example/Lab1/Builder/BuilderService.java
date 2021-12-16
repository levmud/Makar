package org.example.Lab1.Builder;

public class BuilderService {
    public void exec() {
        CarBuilder builder = new CarBuilder();
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
        Car car = builder.getResult();
        System.out.println("Car built:\n" + car.toString());

        CarBuilder builder1 = new CarBuilder();
        builder1.setCarType(CarType.CITY_CAR);
        builder1.setSeats(5);
        builder1.setEngine(new Engine(3.0, 0));
        builder1.setTransmission(Transmission.AUTOMATIC);
        builder1.setTripComputer(new TripComputer());
        builder1.setGPSNavigator(new GPSNavigator());
        Car car1 = builder1.getResult();
        System.out.println("Car built:\n" + car1.toString());
    }
}
