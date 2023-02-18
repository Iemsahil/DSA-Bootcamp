package com.sahil;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<>(5);

//        list.add(85);
//        list.add(23);
//        list.add(82);
//        list.add(88);
//        list.add(789);
//        list.add(09);
//        list.add(76);

//        System.out.println(list.contains(88));
//        System.out.println(list);
//        list.set(0, 99); // replace
//
//        list.remove(2);
//
//        System.out.println(list);

        //input
        // get item at any index
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here
        }
        System.out.println(list);


    }
}
