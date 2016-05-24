package com.coronate.designpatterns.creationalpatterns.singleton;

/**
 * It creates the instance in global access method.
 *
 * It works in case of single threaded  environment, In multi threaded environment singleton will break of multiple
 * thread enter the loop at same time. And threads will get different instances of singleton class.
 */
public class LazyInitializationSingleton {

    private static LazyInitializationSingleton instance;

    private LazyInitializationSingleton(){}

    public static LazyInitializationSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializationSingleton();
        }
        return instance;
    }
}
