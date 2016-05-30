package com.coronate.designpatterns.creationalpatterns.prototype;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class WhenTestingPrototypePattern {

    Employees emps;
    Employees empsNew;
    Employees empsNew1;
    List<String> list;
    List<String> list1;

    @Before
    public void setup() throws CloneNotSupportedException{
        emps = new Employees();
        emps.loadData();

        empsNew = (Employees) emps.clone();
        empsNew1 = (Employees) emps.clone();

        list = empsNew.getEmpList();
        list.add("AbhishekNew");

        list1 = empsNew1.getEmpList();
        list.remove("Abhishek");
    }

    @Test
    public void thenOriginalEmployeesObject(){
        assertEquals(emps.getEmpList().toString(), "[Abhishek, Abhishek1, Abhishek2, Abhishek3]");
    }

    @Test
    public void thenNew1EmployeesObject(){
        assertEquals(list.toString(), "[Abhishek, Abhishek1, Abhishek2, Abhishek3, Abhishek3, AbhishekNew]");
    }

    @Test
    public void thenNew2EmployeesObject(){
        assertEquals(list1.toString(), "[Abhishek2, Abhishek3, Abhishek4]");
    }
}
