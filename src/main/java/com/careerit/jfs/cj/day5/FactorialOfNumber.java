package com.careerit.jfs.cj.day5;

public class FactorialOfNumber {

    public static void main(String[] args) {
        int num = 6;
        int res = factorial(num);
        int oddSum = sumOfFirstNOddNumbers(num);
        System.out.println("Factorial of " + num + " is " + res);
        System.out.println("Sum of " + num + " odd numbers is " + oddSum);
    }
    public static int factorial(int num) {
        int fact = 1;
        int i = 2;
        while(i <= num) {
            fact *= i;
            i++;
        }
        return fact;
    }

    public static int sumOfFirstNOddNumbers(int n) {

        int i = 1;
        int sum = 0;
        while (i <= n) {
            if(i % 2 != 0) {
                sum += i;
            } else {
                continue;
            }
            i++;
        }
        return sum;
    }
}
