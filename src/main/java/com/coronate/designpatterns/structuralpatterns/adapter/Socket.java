package com.coronate.designpatterns.structuralpatterns.adapter;

public class Socket {

    public Volt getVolt(){
        return new Volt(120);
    }
}
