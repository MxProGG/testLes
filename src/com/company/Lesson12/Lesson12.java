package com.company.Lesson12;

public class Lesson12 {

    public static void TypeDate(){
        byte a = -127;
        short b = 12345;
        int c = 12315466;
        long d = 1234567891;
        System.out.println(a);
        System.out.println(b*a);
        System.out.println(c-b);
        System.out.println(d+c);
        System.out.println();
        double dbl = 155.666;
        float flt = 14214.123f;
        System.out.println(dbl);
        System.out.println(dbl+flt);
        String str = "Ravno: ";
        System.out.println(str+dbl);
        String str1 = "ravno" + a + " " + str;
        System.out.println(str1 + (a + b));
        boolean bool1 = true;
        boolean bool2 = a + b <0;
        System.out.println(bool2);
        char dd = '4';
        System.out.println(dd);
    }

}
