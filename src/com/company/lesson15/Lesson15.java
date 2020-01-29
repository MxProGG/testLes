package com.company.lesson15;
import java.lang.String;

public class Lesson15 {

    public static void Strings(){

        String str = "hi";

        System.out.println(str.equals("hi"));

        String str2= "Hi";
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));

        str = "TeXt";
        System.out.println();
        System.out.println(str);
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println();
        System.out.println(str.charAt(0));
        System.out.println();
        System.out.println(str.indexOf("X"));
        str = "hello world  ";
        System.out.println(str.contains("hel"));
        System.out.println(str.length());
        System.out.println(str.startsWith("he"));
        System.out.println(str.startsWith("ld"));
        System.out.println(str.endsWith("he"));
        System.out.println(str.endsWith("ld"));
        System.out.println();
        String[] str3 = str.split(" ");
        System.out.println(str3[0] + " also " + str3[1]);

        System.out.println();
        String str4 = "My names is %s !  i'm %d years old!";
        int age = 30;
        String name = "Max";
        System.out.println(String.format(str4,"sdf",12));
        System.out.println(String.format(str4,name,age));

        System.out.println();
        String age2 = "30";
        int a = Integer.parseInt(age2);
        System.out.println(a*3);

        age2 = "hello world!";
        System.out.println(age2.substring(7,age2.length()-2));
        System.out.println();
        System.out.println(str+age2);
        String res = str + age2;
        System.out.println(res);
        res = str.concat(age2).concat(str4);
        System.out.println(res);





    }

}
