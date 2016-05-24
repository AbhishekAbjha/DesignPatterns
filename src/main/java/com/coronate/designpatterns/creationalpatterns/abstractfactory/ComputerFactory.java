package com.coronate.designpatterns.creationalpatterns.abstractfactory;

/**
 * Consumer class that will provide the entry point for the client classes
 * to create sub-classes.
 *
 * Creating this class as singleton for practice
 */
public class ComputerFactory {

    private ComputerFactory(){}

    private static class ComputerFactoryHelper{
        private static final ComputerFactory computerFactoryInstance = new ComputerFactory();
    }

    public static ComputerFactory getComputerFactoryInstance(){
        return ComputerFactoryHelper.computerFactoryInstance;
    }

    public Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
