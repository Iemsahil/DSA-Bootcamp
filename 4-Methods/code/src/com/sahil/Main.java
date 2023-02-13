package com.sahil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Q: take input of 2 numbers and print the sum

        Scanner in = new Scanner(System.in);
        int num1, num2, sum;
        System.out.println("Enter number 1: ");
        num1 = in.nextInt();
        System.out.println("Enter number 1: ");
        num2 = in.nextInt();
        sum = num2 + num1;
        System.out.println("The sum = " + sum);
    }
}