package com.company.lesson20_21;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;

public class Lesson20_21 {

    public static void setAndMap(){

        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.add(12);
        set.add(13);
        set.add(13);

        System.out.println(set.size());

        Iterator<Integer> it = set.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();
        set.remove(11);
        for (int i : set){
            System.out.println(i);
        }

        System.out.println(set.contains(13));


        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Green");
        map.put(45, "Black");
        map.put(8, "Yellow");

        System.out.println(map.get(1));
        System.out.println(map.size());
        //map.clear();
        System.out.println(map.size());
        System.out.println(map.containsKey(1));
        System.out.println(map.containsValue("Black"));
        Set<Integer> keys = map.keySet();
        Iterator<Integer> iterator2 = keys.iterator();
        while (iterator2.hasNext())
            System.out.println(map.get(iterator2.next()));
        System.out.println();
    }
}
