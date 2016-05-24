package com.coronate.designpatterns.creationalpatterns.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Sample program
 */
public class Employees implements Cloneable {

    private List<String> empList;

    public Employees() {
        empList = new ArrayList<String>();
    }

    public Employees(List empList) {
        this.empList = empList;
    }

    public void loadData(){
        // mock that data is loaded from database
        empList.add("Abhishek");
        empList.add("Abhishek1");
        empList.add("Abhishek2");
        empList.add("Abhishek3");
    }

    public List<String> getEmpList(){
        return empList;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        List<String> temp = new ArrayList<String>();
        for(String s : this.getEmpList()){
            temp.add(s);
        }
        return new Employees(temp);
    }
}
