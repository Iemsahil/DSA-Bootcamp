package com.sahil;

import java.util.Arrays;

public class ReversingArray {
    public static void main(String[] args) {
        int[] arr = {7, 2,34,56, 78,98};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void reverse(int[] array) {
        int start = 0;
        int end = array.length-1;

        while (start < end) {
            //swap
            swap(array, start, end);
            start++;
            end--;

        }
    }
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
