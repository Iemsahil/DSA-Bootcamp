package com.sahil;

public class Overloading {
    public static void main(String[] args) {
//        fun(78);
//        fun("MD Sahil");
        int ans = sum(3,4);
        System.out.println(ans);
    }

    static int sum(int a, int b) {
        return a + b;
    }
    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static void fun(int a) {
        System.out.println(a);
    }
    static void fun(String name) {
        System.out.println(name);
    }

}
