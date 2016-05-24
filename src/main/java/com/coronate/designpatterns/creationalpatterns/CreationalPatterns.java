package com.coronate.designpatterns.creationalpatterns;

/**
 * Creational design patterns provide solution to instantiate a object in the best possible way for specific situation.
 *
 * Various types of creational design patterns.
 *
 * 1. Singleton
 * 2. Factory
 * 3. Abstract Factory
 * 4. Builder
 * 5. Prototype
 */
public class CreationalPatterns {

    /**
     * Singleton pattern restricts the instantiation of the class and ensures that only one instance of the class exists in
     * java virtual machine.
     *
     * Mostly used for logging, drivers objects, caching and thread pool.
     *
     * Different approaches but all of them follow common concepts
     * -- Private constructor.
     * -- Private static variable.
     * -- Public static method that returns the instance of the class.
     *
     */
    public void singletonPattern(){

    }


    /**
     * Factory pattern is used when we have a super class with multiple sub-classes and based on input, we need to
     * return on of the sub-classes. This pattern takes out the responsibility of instantiating and object from
     * client program to the factory class.
     *
     * Benefits
     * -- Provides approach to code for interface rather than implementation.
     * -- Remove instantiation of actual implementation making it robust, less coupled and easy to extend
     * -- Provide abstraction between client classes through inheritance.
     *
     * Examples in JDK valueOf() Boolean, Integer, java.util.calendar
     */
    public void factoryPattern(){

    }

    /**
     * Abstract factory pattern is similar to factory pattern except it is more like
     * factory of factories.
     *
     * In factory pattern, there is a single factory class and returns sub classes using
     * if and else statement.
     *
     * In abstract factory we will get rid of it and will have factory class for
     * each sub-class and then an abstract factory class to return the sub-classes based
     * on input factory class.
     *
     */
    public void abstractFactoryPattern(){

    }

    /**
     * It is introduced to solve some problems
     * within Abstract factory and factory patterns when object contains a lot of attributes.
     *
     * Major issues with factory and Abstract factory design.
     * -- Too many arguments to pass from client to Factory is error prone.
     * -- Some of parameters are optional but forced to send parameters as null
     * -- If object is heavy and its creation is complex will be part of factory classes that is confusing.
     *
     *
     */
    public void builderPattern(){

    }

    /**
     * Prototype pattern is used when the object creation is a costly affair and requires
     * a lot of time and resources and you have a similar object already existing.So this pattern
     * provides a mechanism to copy the original object to a new object and then modify it according to its
     * need.
     *
     * Prototype pattern mandates that the Object which you are copying should provide the copying feature.
     */
    public void prototypePattern(){

    }




}
