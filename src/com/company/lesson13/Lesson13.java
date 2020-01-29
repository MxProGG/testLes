package com.company.lesson13;

public class Lesson13 {


    static public void Array(){

        String[] name;
        name = new String[5];

        String [] names =new String[3];
        names[0] = "Max";
        names [1] = "Kris";
        names [2] = "Nik";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println();

        int[] num = new int[] {12,14,11,155};
        //num[2] = 111;
        System.out.println(num[2]);
        System.out.println();

        for (int i=0; i<num.length; i++){
            System.out.println(num[i]);
        }
        System.out.println();

        int c = 4;
        int[] arr = new int[c];
        for(int j=0; j < arr.length; j++){
            arr[j] = j + 15;
            System.out.println(arr[j]);

        }



    }


}
