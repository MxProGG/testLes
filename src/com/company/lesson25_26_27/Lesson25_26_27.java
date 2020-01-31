package com.company.lesson25_26_27;

import java.util.Scanner;

public class Lesson25_26_27 {


    public static void releaseClass (){

        Scanner inputLesson = new Scanner(System.in);
        System.out.println("Input number podlesson: ");
        int numLesson = inputLesson.nextInt();

    switch (numLesson){
        case 26:
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
            break;
        case 28:
            Cat cat = new Cat();
            Dog dog = new Dog();

            cat.color = "balck";
            dog.color = "red";

            cat.color("white");
            dog.say("GAV!!");

            System.out.println("Cat clor is " + cat.color);
            System.out.println("Dog clor is " + dog.color);
            dog.sound();
            cat.sound();
            break;


    }


    }
}
