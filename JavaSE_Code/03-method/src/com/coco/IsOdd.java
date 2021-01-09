package com.coco;

public class IsOdd {
    public static void main(String[] args) {
     boolean flag = isOdd(46);
        System.out.println(flag);
    }

    public static boolean isOdd(int num) {
        if(num % 2 != 0){
            return true;
        }else {
            return false;
        }
    }
}
