package com.coronate.designpatterns.creationalpatterns.factory;

/**
 * We can keep Factory class singleton or keep the method that returns the subclass as static.
 */
public class ComputerFactory {

    public static Computer getComputer(String type, String ram, String hdd, String cpu){
        if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        else if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);

        return null;
    }
}
