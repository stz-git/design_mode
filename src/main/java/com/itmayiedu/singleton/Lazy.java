package com.itmayiedu.singleton;

public class Lazy {
    private static Lazy lazy;
    private Lazy(){}

    //thread not safe
    public static synchronized Lazy getInstance(){
        if(lazy == null)
            lazy = new Lazy();
        return lazy;
    }
}
