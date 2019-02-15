package com.itmayiedu.singleton;

public class Main {

    public static void main(String[] args) {

    }
}
//com.itmayiedu.singleton.Lazy@338f7170
//com.itmayiedu.singleton.Lazy@3d8fd87b
//test: not singleton
class TestThread extends Thread{
    @Override
    public void run(){
        try{
            Thread.sleep(1000);
            Lazy instance = Lazy.getInstance();
            System.out.println(instance);
        }catch (Exception e) {

        }
    }
}
