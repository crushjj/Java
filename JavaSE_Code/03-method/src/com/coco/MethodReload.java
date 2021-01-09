package com.coco;

public class MethodReload {
    public static void main(String[] args) {
        int twoParams = sum(3, 5);
        double doubleParams = sum(3.2, 5.6);
        int threeParams = sum(3, 5, 10);
        System.out.println(twoParams);
        System.out.println(doubleParams);
        System.out.println(threeParams);
    }
    public static int sum(int a, int b) {
        return a + b;
    }
    public  static double sum(double a, double b) {
        return a + b;
    }
    public  static  int sum(int a, int b, int c) {
        return a + b + c;
    }
}
