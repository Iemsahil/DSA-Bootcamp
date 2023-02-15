package com.sahil;

import java.lang.reflect.Array;
import java.util.Arrays;

public class VarArgs { // variable length of argument
    public static void main(String[] args) {
//        fun(5,6,89,5965,5965,9865,8,56,7);
//        multiple(1,2,"sahil", "nitesh", "shanky");
        demo(1,2,3,4,65);
    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void multiple (int a, int b, String...v) {

    }
    static void fun (int ...v) {
        System.out.println(Arrays.toString(v));
    }
}
