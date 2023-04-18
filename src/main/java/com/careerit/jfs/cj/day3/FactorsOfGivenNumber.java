package com.careerit.jfs.cj.day3;

public class FactorsOfGivenNumber {
    public static void main(String[] args) {

        int n = 29;
        for(int i =1; i <= n; i++) {
            if(n % i == 0) {
                System.out.println(i+" ");
            }
        }
    }
}
