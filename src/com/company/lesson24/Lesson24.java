package com.company.lesson24;

public class Lesson24 {

    public static void exception(){
        delenie(10,2);
        try {
            delenie(10,0,"!!!");
        } catch (ArithmeticException e){
            e.printStackTrace();
        }


    }

    static void delenie(int a, int b){
        try {
            System.out.println("Result: " + a/b);
        }catch (ArithmeticException e){
            System.out.println("Problem!!!");
            }
        finally {
            System.out.println("end programm!");
        }

    }

    static void delenie(int a, int b,String n) throws ArithmeticException{
        if(b==0){
           throw new ArithmeticException("devide by null!!");
        }
        System.out.println("Result: " + a/b + n);
         }



}
