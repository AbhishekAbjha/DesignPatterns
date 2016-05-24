package com.coronate.designpatterns.creationalpatterns.singleton;

/**
 * Creates the singleton class with the help of inner static helper class.
 *
 * Singleton Helper inner class is not loaded in memory until someone calls the getInstance method.
 *
 * Most widely used approach.
 *
 */
public class BillPughSingleton {

    private  BillPughSingleton(){}

    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
}
