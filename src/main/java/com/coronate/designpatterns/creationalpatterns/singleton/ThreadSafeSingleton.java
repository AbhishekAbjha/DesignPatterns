package com.coronate.designpatterns.creationalpatterns.singleton;

/**
 * To create thread safe singleton class is to make a global access method synchronized, so that only one thread
 * can execute this method at a time.
 *
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton(){}

    /**
     * This will work fine and provide thread-safety but it reduces the performance because of the cost associated
     * with the synchronized method.
     *
     * To avoid this extra overhead every time double checked locking principle is used.
     *
     * @return
     */
    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }

    /**
     * In this the synchronized block is used inside the if condition with an additional check to ensure that only
     * one instance of singleton class is created.
     *
     * @return
     */
    public static ThreadSafeSingleton getInstanceUsingDoubleLocking(){
        if(instance == null){
            synchronized (ThreadSafeSingleton.class){
                if(instance == null){
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }
}
