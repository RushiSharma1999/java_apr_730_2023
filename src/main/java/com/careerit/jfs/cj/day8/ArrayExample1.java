package com.careerit.jfs.cj.day8;

import java.util.Arrays;

public class ArrayExample1 {
    public static void main(String[] args) {
        String data ="10,20,30,40,50,60,70,80,90,100";
        String[] arr = data.split(",");

        int[] nums = new int [arr.length];
        for(int i = 0; i < arr.length; i++) {
            int number = Integer.parseInt(arr[i]);
            nums[i] = number;
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
