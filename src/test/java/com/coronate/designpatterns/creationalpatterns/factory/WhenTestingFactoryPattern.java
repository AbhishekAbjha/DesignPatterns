package com.coronate.designpatterns.creationalpatterns.factory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 *
 */
public class WhenTestingFactoryPattern {

    @Before
    public void setup(){

    }

    @Test
    public void thenTestPCConfig(){
        Computer pc = ComputerFactory.getComputer("pc", "2 GB", "500 GB", "2.4GHz");
        assertEquals(pc.toString(), "RAM= 2 GB, HDD= 500 GB, CPU= 2.4GHz");
    }

    @Test
    public void thenTestServerConfig(){
        Computer server = ComputerFactory.getComputer("server", "16 GB", "1 TB", "3.1 GHz");
        assertEquals(server.toString(), "RAM= 16 GB, HDD= 1 TB, CPU= 3.1 GHz");
    }
}
