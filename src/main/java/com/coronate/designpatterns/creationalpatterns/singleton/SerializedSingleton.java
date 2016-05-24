package com.coronate.designpatterns.creationalpatterns.singleton;

import java.io.Serializable;

/**
 * Sometimes in distributed systems, we need to implement Serializable interface in Singleton class, so that
 * we can store it's state in file system an retrieve it at later point of time.
 *
 */
public class SerializedSingleton implements Serializable{

    private final static long serialVersionUID = -1L;

    private SerializedSingleton(){}

    private static class SingletonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance(){
        return SingletonHelper.instance;
    }
    
}
