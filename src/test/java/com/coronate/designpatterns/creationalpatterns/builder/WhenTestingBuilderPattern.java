package com.coronate.designpatterns.creationalpatterns.builder;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 *
 */
public class WhenTestingBuilderPattern {

    @Before
    public void setup() {}

    @Test
    public void testComputerInstance(){
        Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB").setBluetoothEnabled(true)
                .setGraphicsCardEnabled(false).build();

        assertEquals(comp.getHDD(), "500 GB");
        assertEquals(comp.getRAM(), "2 GB");
        assertEquals(comp.isBluetoothEnabled(), true);
        assertEquals(comp.isGraphicsCardEnabled(), false);
    }
}
