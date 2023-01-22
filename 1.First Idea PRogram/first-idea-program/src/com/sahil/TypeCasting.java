package com.sahil;

import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        float num = input.nextFloat();
//        int num1 = input.nextInt();
//        System.out.println(num);

//        Type Casting
        int num = (int)(54.4546f);
        System.out.println(num);

//        Automatic type promotion in expressions
//        int a = 257;
//        byte b = (byte) (a); //  257 % 256 = 1
//        System.out.println(b);

//        byte a = 40;
//        byte b = 50;
//        byte c = 100;
//        int d = (a * b) / c;
//
//        System.out.println(d);
//
//        int number = 'A';
//        System.out.println(number);

        byte b = 45;
        char c = 'a';
        short s = 1024;
        int i = 52001;
        float f = 5.23f;
        double d = 0.1245678;
        double result = (f * b) + (i / c) - (d * s);
        //float + int - double = double
        System.out.println((f * b) + " " + (i / c)  + " " + (d * s));
        System.out.println(result);
    }
}
