package com.sahil;

import java.util.Arrays;

public class PassinginFunctions {
    public static void main(String[] args) {
        int[] nums = {4, 6, 98, 78, 20};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }

    static void change(int[] arr) {
        arr[0] = 88;
    }
}
