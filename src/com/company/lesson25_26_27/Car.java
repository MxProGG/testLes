package com.company.lesson25_26_27;

public class Car {

    public Car(){
        System.out.println("New car created");

    }

    public Car(String color){
        this.color = color;
    }

    public Car(String color,int weight, int lenght, int height ){
        this.color = color;
        this.weight = weight;
        this.height = height;
        this.lenght = lenght;
    }


    int height;
    int width;
    int lenght;
    int speed;
    String color;
    int maxSpeed = 260;
    int weight = 2000;
    int maxWeight = 2700;

    public void addWeight(int weight){
        this.weight += weight;
        System.out.println("new weight: " + this.weight);
        }
        public void driver(int speed){

        if (weight<=maxWeight){
            this.speed += speed;
            System.out.println("Go GO drive!");
        } else {
            System.out.println("Cannot drive!");
        }

        }
}
