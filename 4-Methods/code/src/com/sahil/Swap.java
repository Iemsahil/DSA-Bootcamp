package com.sahil;

public class Swap {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;

        //swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;
        swap(a,b);
        System.out.println(a + " " + b);

        String name = "MD Sahil";
        changeName(name);
        System.out.println(name);
    }
    static void changeName(String name) {
        name = "NO Name"; // creating a new object
    }
    static void swap(int num1 ,int num2) {
        int temp = num1;
        num1 = num2;
        num2 = temp;

        //this change will only be valid in this functions scope only.
    }


}
