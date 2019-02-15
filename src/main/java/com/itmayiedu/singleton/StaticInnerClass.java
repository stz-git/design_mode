package com.itmayiedu.singleton;

//thread safe
//lazyLoad

public class StaticInnerClass {

    private StaticInnerClass(){
        System.out.println("123");
    }

    public static class StaticInnerClassInstance{
        private static StaticInnerClass staticInnerClass = new StaticInnerClass();//lazyLoad and just one instance
    }

    public static StaticInnerClass getInstance(){
        return StaticInnerClassInstance.staticInnerClass;
    }
}
