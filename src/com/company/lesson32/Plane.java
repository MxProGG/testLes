package com.company.lesson32;

public class Plane implements Transport{
    @Override
    public void go() {
        System.out.println("Fly");
    }

    @Override
    public void stop() {
        System.out.println("crash!");
    }
}
