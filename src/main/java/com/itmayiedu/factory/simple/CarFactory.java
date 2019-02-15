package com.itmayiedu.factory.simple;

public class CarFactory {
    public static Car createCar(char name){
        switch (name){
            case 'a':
                return new Audi();
            case 'b':
                return new Benz();
            default:
                return null;
        }
    }
}
