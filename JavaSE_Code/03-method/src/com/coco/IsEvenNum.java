package com.coco;

public class IsEvenNum {
    public static void main(String[] args) {
        isEvenNum(31);
    }

    public static void isEvenNum(int num) {
        if(num % 2 != 0 ){
            System.out.println(num+"不是偶数");
        }else {
            System.out.println(num+"是偶数");
        }
    }
}
