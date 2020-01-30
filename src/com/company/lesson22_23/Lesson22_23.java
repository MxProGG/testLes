package com.company.lesson22_23;

public class Lesson22_23 {

    public static void Methodd() {

        int a = 11;
        int b = 33;
        int c = 22;
        int summ  = getSumm(a, b, c);
        System.out.println(summ);
        showSum(12,12,13, "MAX");
        showSum(12,44,11,"Nik","s DR");

       summ =  getSumm(1,10);
        System.out.println(summ);
       summ = getSumm(1,2,4);
        System.out.println(summ);
        int[] ar = {12,14,15};

        int s = getSumm(ar,"mX1");
        System.out.println(s + 200);



    }

    static int getSumm(int x, int y, int z){

        return x + y + z;
   }

    static int getSumm(int x, int y){

        return x + y ;
    }

    static int getSumm(int [] array, String name){
        int sum = 0;
    for (int i = 0; i<array.length; i++){
    sum += array[i];
    }
        System.out.println("hi " + name);
        System.out.println("sum array: " + sum);
        return  sum;
    }

   static void showSum(int x, int y, int b, String n){
        int s = x + y + b;
       System.out.println("Summ is: " + s);
       System.out.println("Hi " + n + "!!!");
        }


    static void showSum(int x, int y, int b, String n, String n2){
        int s = x + y + b;
        System.out.println("Summ is: " + s);
        System.out.println("Hi " + n + "!!! " + n2);
    }




}
