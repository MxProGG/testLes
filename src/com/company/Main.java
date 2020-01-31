package com.company;
import com.company.Lesson12.Lesson12;
import com.company.lesson13.Lesson13;
import com.company.lesson15.Lesson15;
import com.company.lesson16.Lesson16;
import com.company.lesson17.Lesson17;
import com.company.lesson18.Lesson18;
import com.company.lesson20_21.Lesson20_21;
import com.company.lesson22_23.Lesson22_23;
import com.company.lesson24.Lesson24;
import com.company.lesson25_26_27.Car;
import com.company.lesson25_26_27.Lesson25_26_27;
import com.company.lesson32.Lesson32;

import java.util.Scanner;
import java.lang.String;


public class Main {

    public static void main(String[] args) {

        Scanner inputLesson = new Scanner(System.in);
        System.out.println("Input number lesson: ");

        int numLesson = inputLesson.nextInt();

        switch (numLesson) {
            case 12:
                System.out.println("Result is work Lesson " + numLesson + ":");
                Lesson12.TypeDate();
                break;
            case 13:
                System.out.println("Result is work Lesson " + numLesson + ":");
                Lesson13.Array();
                //Для статических методов, можно обратиться без создания объекта класса.
                // Lesson13.Array();
                //для не статических методов нобходимо сначало инициализировать обьект класса, а после уже вызывать метод.
                /* Lesson13 array= new Lesson13();
                array.Array();*/
                break;
            case 15:
                System.out.println(String.format("Resul is work Lesson %d:\n",numLesson));
                Lesson15.Strings();
                break;
            case 16:
                System.out.printf("Resul is work Lesson %d:\n", numLesson);
                Lesson16.condition();
                break;
            case 17:
                System.out.printf("Resul is work Lesson %d:\n", numLesson);
                Lesson17.cycle();
                break;
            case 18:
                System.out.printf("Resul is work Lesson %d:\n", numLesson);
                Lesson18.myList();
                break;
            case 20:
                System.out.printf("Resul is work Lesson %d:\n", numLesson);
                Lesson20_21.setAndMap();
                break;
            case 22:
                System.out.printf("Resul is work Lesson %d:\n", numLesson);
                Lesson22_23.Methodd();
                break;
            case 24:
                System.out.printf("Resul is work Lesson %d:\n", numLesson);
                Lesson24.exception();
                break;
            case 25:
                System.out.printf("Resul is work Lesson %d:\n", numLesson);
                Lesson25_26_27.releaseClass();
                /*Car var = new Car("rrrrrrrrrrr");
                System.out.println(var);*/
                break;
            case 32:
                System.out.printf("Resul is work Lesson %d:\n", numLesson);
                Lesson32.interfaceLes();
                break;
            default:
                System.out.println("Entered lesson is not found!");

        }

    }
}
