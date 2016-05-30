package com.coronate.designpatterns.structuralpatterns.adapter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WhenTestingAdapter {

    @Before
    public void setup(){

    }

    @Test
    public void thenTestClassAdapter(){
        SocketAdapter socketAdapter = new SocketClassAdapterImplementation();

        Volt v3 = socketAdapter.get3Volt();
        Volt v12 = socketAdapter.get12Volt();
        Volt v120 = socketAdapter.get120Volt();

        assertEquals(v3.getVolts(), 3);
        assertEquals(v12.getVolts(), 12);
        assertEquals(v120.getVolts(), 120);
    }

    @Test
    public void thenTestObjectAdapter(){
        SocketAdapter socketAdapter = new SocketObjectAdapterImplementation();

        Volt v3 = socketAdapter.get3Volt();
        Volt v12 = socketAdapter.get12Volt();
        Volt v120 = socketAdapter.get120Volt();

        assertEquals(v3.getVolts(), 3);
        assertEquals(v12.getVolts(), 12);
        assertEquals(v120.getVolts(), 120);
    }

    @After
    public void tearDown(){

    }
}
