package com.coronate.designpatterns.creationalpatterns.abstractfactory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 *
 */
public class WhenTestingAbstractFactoryPattern {

    ComputerFactory computerFactoryInstance;

    @Before
    public void setup(){
        computerFactoryInstance = ComputerFactory.getComputerFactoryInstance();
    }

    @Test
    public void thenTestPCConfig() {
        Computer pc = computerFactoryInstance.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));
        assertEquals(pc.toString(), "RAM= 2 GB, HDD= 500 GB, CPU= 2.4 GHz");
    }

    @Test
    public void thenTestServerConfig(){
        Computer server = computerFactoryInstance.getComputer(new ServerFactory("16 GB", "1 TB", "3.1 GHz"));
        assertEquals(server.toString(), "RAM= 16 GB, HDD= 1 TB, CPU= 3.1 GHz");
    }



}
