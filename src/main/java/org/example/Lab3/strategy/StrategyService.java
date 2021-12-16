package org.example.Lab3.strategy;

public class StrategyService {

    public static void main(String[] args) {

        Auto truck = new Truck();
        Auto buggies= new ChildrenBuggies();
        Auto f1car = new F1Car();

        truck.fill();
        f1car.fill();
        buggies.fill();

    }
}
