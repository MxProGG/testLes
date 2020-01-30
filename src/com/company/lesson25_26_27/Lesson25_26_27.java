package com.company.lesson25_26_27;

public class Lesson25_26_27 {


    public static void releaseClass (){

        System.out.println(Car.VAR);
        Car.method();
        Car car1 = new Car();
        car1.color = "black";
        car1.lenght = 5000;
        car1.height = 2000;
        car1.width = 2000;
        car1.addWeight(50);
        car1.driver(120);
        car1.addWeight(7800);
        car1.driver(150);

        Car car2 = new Car();
        car2.color = "White";
        Car car3 = new Car();

       car2.driver(400);
       car3.driver(100);

       Car car4 = new Car("Red");
        System.out.println("Color is " + car4.color);

        Car car5 = new Car("Red", 2100, 2000, 1000);
        System.out.println("Color is " + car4.color + " Weight is " + car5.weight + " Leight is " + car5.lenght + " Height is " + car5.height);
    }
}
