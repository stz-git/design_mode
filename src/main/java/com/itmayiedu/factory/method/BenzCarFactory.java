package com.itmayiedu.factory.method;

import com.itmayiedu.factory.simple.Benz;
import com.itmayiedu.factory.simple.Car;

public class BenzCarFactory implements CarFactory{
    public Car createCar() {
        return new Benz();
    }
}
