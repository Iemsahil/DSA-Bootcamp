package com.sahil;

import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        //create an Array
        int[] arr = {1, 2, 3, 45,65};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums) {
        nums[0] = 99; // if you make a change to the object via this ref variable, same object will be changed
    }

}
