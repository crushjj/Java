package com.coco;

public class ArrayMax {
    public static void main(String[] args) {
        int[] arr = { 33, 90, 44, 87, 23, 65, 74 };

        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
