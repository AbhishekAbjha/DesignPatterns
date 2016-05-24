package com.coronate.designpatterns.creationalpatterns.singleton;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.io.*;

/**
 * Serialization breaks singleton
 */
public class WhenBreakingSingletonDuringSerialization {

    @Before
    public void setup(){

    }

    @Test
    public void thenTwoInstancesOfSerializedSingletonClass() {
        SerializedSingleton instanceOne = SerializedSingleton.getInstance();
        SerializedSingleton instanceTwo = null;

        try {
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
            out.writeObject(instanceOne);
            out.close();

            ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
            instanceTwo = (SerializedSingleton) in.readObject();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertNotEquals(instanceOne.hashCode(), instanceTwo.hashCode());
    }

    @Test
    public void thenOneInstancesOfSerializedSingletonClass() {
        SerializedSingleton instanceOne = SerializedSingleton.getInstance();
        SerializedSingleton instanceTwo = null;

        try {
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
            out.writeObject(instanceOne);
            out.close();

            ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
            instanceTwo = (SerializedSingleton) in.readObject();
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        assertNotEquals(instanceOne.hashCode(), instanceTwo.hashCode());
    }
}
