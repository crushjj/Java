package com.coco;

public class ArrayWatch {
    public static void main(String[] args) {
        /* 第一种方式创建方式 */
        int[] arr = new int[3];
        arr[0] = 220;
        arr[1] = 133;
        System.out.println(arr[0]);

        /* 第二种初始化方式 */
        int[] arr1 = new int[]{ 220, 222, 221 };
        System.out.println(arr1[2]);

        /* 第三种初始化方式 */
        int[] arr2 = { 9, 6 ,3 };
        System.out.println(arr2[2]);
    }
}
