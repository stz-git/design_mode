package com.itmayiedu.factory.method;

import com.itmayiedu.factory.simple.Car;

public class Main {
    public static void main(String[] args) {
        Car audi = new AudiCarFactory().createCar();
        audi.run();
        Car benz = new BenzCarFactory().createCar();
        benz.run();
    }
}
