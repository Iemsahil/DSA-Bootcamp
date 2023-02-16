package com.sahil;

public class Main {
    public static void main(String[] args) {
        //Q: store a roll number
        int a = 19;

        //Q: store a person's name
        String name = "MD Sahil";

        //Q: store 5 roll numbers
        int rno1 = 45;
        int rno2 = 78;
        int rno3 = 10;

        // SYNTAX
        // datatype[] variable_name = new datatype[size];
        //Q: store 5 roll numbers:
        // datatype[] store what the data store
//        int[] rnos = new int[5];
//        // or directly
//        int[] rnos2 = {4, 45, 85, 76, 20};
        // all the data store in the array should be same
        int[] ros; // declaration of array: ros is getting defined in the stack
        ros = new int[5]; // initialisation: actually here object is being created in the memory (heap)

        System.out.println(ros[1]);

        String[] arr = new String[4];
        System.out.println(arr[0]);



    }
}