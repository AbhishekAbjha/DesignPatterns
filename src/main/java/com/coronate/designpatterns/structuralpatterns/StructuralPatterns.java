package com.coronate.designpatterns.structuralpatterns;

/**
 * Structural patterns provide different ways to create a class structure. For example using
 * inheritance and composition to create a large object from small objects.
 *
 * Types of Structural pattern
 * 1. Adapter
 * 2. Composite
 * 3. Proxy
 * 4. Flyweight
 * 5. Facade
 * 6. Bridge
 * 7. Decorator
 *
 */
public class StructuralPatterns {

    /**
     * It is used so that two unrelated interfaces can work together.
     * The object that joins these unrelated interface is called an Adapter.
     *
     * For example mobile needs 3 volt but normal socket produces 120V. so, mobile charger work as an
     * adapter between mobile charging socket and the wall socket.
     *
     * Adapter pattern can be implemented in two ways
     * 1. Class Adapter - This form uses java inheritance and extends the source interface
     * , in our case Socket class.
     * 2. Object Adapter - This form uses java Composition and adapter contains the source object.
     *
     * Example: java.util.Array, java.io.inputStreamReader, java.io.outputStreamReader
     */
    public void adapter(){}

    /**
     *
     */
    public void composite(){}

    /**
     *
     */
    public void proxy(){}

    /**
     *
     */
    public void flyweight(){}

    /**
     *
     */
    public void facade(){}

    /**
     *
     */
    public void bridge(){}

    /**
     *
     */
    public void decorator(){}


}
