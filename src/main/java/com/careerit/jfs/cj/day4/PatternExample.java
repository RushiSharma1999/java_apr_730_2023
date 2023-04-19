package com.careerit.jfs.cj.day4;

import java.time.LocalDateTime;

public class PatternExample {

    public static void main(String[] args) {
        int n = 5;
        for(int i  = 1; i <=n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println(Math.sqrt(16));
    }

    //method with return type and arguments
    public static int sumOfNaturalNumber(int n) {
        int sum = (n*(n+1))/2;
        return sum;
    }

    //method with return type without arguments
    public static LocalDateTime getSystemTime() {
        return LocalDateTime.now();
    }

    //method without return type with arguments
    public static void showGreetings(String Message) {
        System.out.println(Message);
    }

    //method without return type without arguments
    public static void showDate() {
        System.out.println(LocalDateTime.now());
    }
}
