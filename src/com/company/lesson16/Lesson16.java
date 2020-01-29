package com.company.lesson16;
import java.util.Scanner;

public class Lesson16 {

    public static void condition(){

        System.out.println("Start of Programm");

    Scanner input = new Scanner(System.in);
        System.out.println("Input value: ");
        int i = input.nextInt();


    if (i > 10) {
        System.out.println( "value > 10");
        i++;
        System.out.println("Add + 1, new value: "+i);
    }
    else{
        if (i > 3 && i < 7) {
            System.out.println("value < 10 ");
            System.out.println("value > 3 and value < 7");
            i--;
            System.out.println("Take - 1, new value: " + i);}
        else {
            System.out.println("value < 3");
        }
    }


    switch (i){
        case 1:
            System.out.println("number = 1");
            break;
        case 2:
            System.out.println("number = 2");
            break;
        case 3:
            System.out.println("number = 3");
            break;
        default:
            System.out.println("Fuck!");
    }


        System.out.println("End of Programm");


    }
}
