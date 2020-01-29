package com.company.lesson17;

public class Lesson17 {

    public static void cycle(){

        int[] array = new int[10];

    for (int i = 0; i <10; i++ ){
        array[i] = i*3;
        System.out.println("Element with index "+ i + " is: "+ array[i]);
    }

    for (int elem : array){
        System.out.println(elem);
    }

    int i = 0;
    while (i < 10){
        System.out.println("while: "+ i);
        i++;
    }
    i=0;
        System.out.println();
    boolean bool = true;
        while (bool){
            System.out.println("while: "+ i);
            i++;
            if (i==5){bool=false;}
        }

    int j = 0;
        do {
            System.out.println(j);
            j++;
        }while (j < 7);


    }
}
