package com.coronate.designpatterns.creationalpatterns.singleton;

import jdk.nashorn.internal.runtime.ECMAException;

/**
 * This implementation is similar to eager initialization, except that instance of the class is created
 * in the static block that provides option for exception handling.
 *
 * Both eager and static block initialization create the instance even before it's being used and it is not best practice
 * to follow.
 *
 */
public class StaticBlockInitializationSingleton {

    private static StaticBlockInitializationSingleton instance;

    private StaticBlockInitializationSingleton(){}

    static{
        try{
            instance = new StaticBlockInitializationSingleton();
        }catch(Exception ex){
            throw new RuntimeException("Exception occurred while creating singleton instance");
        }
    }

    public static StaticBlockInitializationSingleton getInstance(){
        return instance;
    }
}
