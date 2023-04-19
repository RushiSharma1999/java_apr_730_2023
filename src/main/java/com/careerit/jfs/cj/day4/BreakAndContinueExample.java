package com.careerit.jfs.cj.day4;

public class BreakAndContinueExample {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,78,9,10,11,12,13,14,15,16,17,18,19,20};

        for(int i = 0; i < arr.length; i++) {
            int elem = arr[i];

            if(elem % 3 == 0 && elem % 6 == 0) {
                break;
            }

            if(elem %3 == 0) {
                continue;
            }


            System.out.println(elem);

        }
    }
}
