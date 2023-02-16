package com.sahil;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // array of primitive
        int[] arr = new int[5];
        arr[0] = 12;
        arr[1] = 122;
        arr[2] = 23;
        arr[3] = 14;
        arr[4] = 98;
        System.out.println(arr[3]);

        // input using for loops
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//
//        System.out.println(Arrays.toString(arr));
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i] + " ");
//        }

//        for (int num : arr) { // for every element in array, print the element
//            System.out.print(num + " ");  // here num represents element of the array
//        }

//        System.out.println(arr[5]); //index put of bound error
        // array of objects
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[1] = "MD Sahil";
        System.out.println(Arrays.toString(str));
    }
}
