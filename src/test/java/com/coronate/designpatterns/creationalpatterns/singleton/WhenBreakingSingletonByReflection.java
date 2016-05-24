package com.coronate.designpatterns.creationalpatterns.singleton;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Constructor;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Reflection can be used to destroy all the above singleton implementation.
 *
 */
public class WhenBreakingSingletonByReflection {

    @Before
    public void setup(){

    }

    @Test
    public void thenSingleInstanceForEagerInitializedSingleton(){
        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = EagerInitializedSingleton.getInstance();

        assertEquals(instanceOne.hashCode(), instanceTwo.hashCode());
    }

    @Test
    public void thenTwoInstancesForEagerInitializedSingleton(){
        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;
        try {
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
                break;
            }
        }catch(Exception e){
            e.printStackTrace();
        }

        assertNotEquals(instanceOne.hashCode(), instanceTwo.hashCode());
    }
}
