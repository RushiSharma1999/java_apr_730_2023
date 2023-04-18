package com.careerit.jfs.cj.day3;

public class FibonacciSeriesExample {
    public static void main(String[] args) {
        int n = 10;

        int a = 0;
        int b = 1;
        System.out.print(a+" "+b+" ");
        for (int i = 3; i <= 10; i++) {
            int sum = a + b;
            a = b;
            b = sum;
            System.out.print(sum+" ");
        }
    }
}
