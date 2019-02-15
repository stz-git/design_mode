package com.itmayiedu.singleton;

public class Hungry {
    private static Hungry hungry = new Hungry();//加了static后，该实例就会在类加载的时候作为属性而初始化

    private Hungry() {
        System.out.println("123");
    }

    public static Hungry getInstance() {
        return hungry;
    }
}
