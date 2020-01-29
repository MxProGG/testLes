package com.company.lesson18;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lesson18 {

    public static void myList(){

        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(15);
        list.add(16);
        System.out.println("Size is array: " + list.size());
        System.out.println("Element array is index 2 : " + list.get(2));
        list.set(2,100);
        System.out.println("Element array is index 2 : " + list.get(2));
        list.remove(2);
        System.out.println("Size is array: " + list.size());
        //list.clear();
        List<Integer> list2 = new ArrayList<>();
        list2.add(777);
        list2.add(888);
        System.out.println("Size is array: " + list.size());
        list.addAll(list2);
        System.out.println("Size is array: " + list.size());
        list.removeAll(list2);
        System.out.println("Size is array: " + list.size());

        System.out.println(list.isEmpty());
        //list.clear();
        System.out.println(list.isEmpty());

        System.out.println(list.contains(15));

        list.addAll(list2);
        System.out.println(list.containsAll(list2));
        list.removeAll(list2);
        System.out.println(list.containsAll(list2));

        Iterator<Integer> iteratir = list.iterator();
        //System.out.println(iteratir.next());
        //System.out.println(iteratir.hasNext());

        while (iteratir.hasNext()){
            System.out.println(iteratir.next());
        }
    }
}
