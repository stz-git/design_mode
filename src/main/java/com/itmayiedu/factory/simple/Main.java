package com.itmayiedu.factory.simple;

public class Main {
    public static void main(String[] args) {
        Car audi = CarFactory.createCar('a');
        Car benz = CarFactory.createCar('b');
        audi.run();
        benz.run();
    }
}
