package com.company.lesson22_23;

public class Lesson22_23 {

    public static void Methodd() {

        int a = 11;
        int b = 33;
        int c = 22;
        int summ  = getSumm(a, b, c);
        System.out.println(summ);
        showSum(12,12,13, "MAX");
    }

    static int getSumm(int x, int y, int z){

        return x + y + z;
   }


   static void showSum(int x, int y, int b, String n){
        int s = x + y + b;
       System.out.println("Summ is: " + s);
       System.out.println("Hi " + n + "!!!");
        }



}
