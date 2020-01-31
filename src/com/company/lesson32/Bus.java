package com.company.lesson32;

public class Bus implements Transport{


    @Override
    public void go() {
        System.out.println("edu!");
    }

    @Override
    public void stop() {
        System.out.println("stou");
    }
}
