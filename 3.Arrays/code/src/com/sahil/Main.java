package com.sahil;

public class Main {
    public static void main(String[] args) {

        //Q: store a roll number
        int a = 19;

        //Q: store a person's name
        String name = "MD Sahil";

        //Q: store 5 roll numbers
        int rno1 = 23;
        int rno2 = 45;
        int rno3 = 45; // and so on.

        //syntax
        //datatype[] variable_name = new datatype[size];
//        int[] rnos = new int[5];
//        //or directly
//        int[] rnos2 = {23, 12, 45, 78, 63};

        int[] ros; // declaration of array, ros is getting defined in the stack
        ros = new int[5]; // initialization: actually her object is being created in the memory (heap)
//        System.out.println(ros[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);
    }

}