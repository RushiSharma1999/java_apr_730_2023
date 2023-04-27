package com.careerit.jfs.cj.day7;

import java.util.concurrent.ThreadLocalRandom;

public class ArrayExample1 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(10,100);
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(arr);
        System.out.println("The sum is :" + sum);
        double avg = sum / (double) arr.length;
        System.out.println("The average is " + avg);
    }

    private static void showDetails(int [] arr) {
        if(arr.length == 0) {
            System.out.println("[]");
        } else {
            String str = "[";
            for (int i = 0; i < arr.length; i++) {
                str += arr[i]+",";
            }
            str +=  str.substring(0, str.length()-1);
            str +="]";
        }
    }
}
