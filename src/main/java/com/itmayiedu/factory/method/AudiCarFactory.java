package com.itmayiedu.factory.method;

import com.itmayiedu.factory.simple.Audi;
import com.itmayiedu.factory.simple.Car;

public class AudiCarFactory implements CarFactory{
    public Car createCar() {
        return new Audi();
    }
}
