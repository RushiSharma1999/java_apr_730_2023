package com.careerit.jfs.cj.day8;

import java.util.Arrays;

public class SearchElement {
    public static void main(String[] args) {
        System.out.println(isAnagram("CAT","BAC"));
    }

    private static int getIndex(int[] arr, int key) {
        //logic
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    private static boolean isSubset(int[] superArr, int[] subArr) {
        if(superArr.length < subArr.length) {
            return false;
        }
        for(int elem: subArr) {
            if(getIndex(superArr, elem) == -1){
                return false;
            }
        }
        return true;
    }

    private static boolean isAnagram(String word1, String word2) {
        if(word2.length() != word1.length()) {
            return false;
        }
        char[] word1Arr = word1.toCharArray();
        char[] word2Arr = word2.toCharArray();
        Arrays.sort(word1Arr);
        Arrays.sort(word2Arr);
        return Arrays.equals(word1Arr, word2Arr);
    }

    private static  int biggest(int[] arr) {
        int oldest = arr[0];
        for(int elem: arr) {
            if(elem > oldest) {
                oldest = elem;
            }
        }
        return oldest;
    }

    private static  int smallest(int[] arr) {
        int min = arr[0];
        for(int elem: arr) {
            if(elem < min) {
                min = elem;
            }
        }
        return min;
    }

    public  static Employee maxPaidEmployee(Employee[] empArr) {
        double maxSal = maxSalary(empArr);
        for(Employee emp: empArr) {
            if(emp.getSalary() == maxSal) {
                return emp;
            }
        }
        throw new IllegalArgumentException("No max paid employees");
    }

    private static double maxSalary(Employee[] emp) {
        double max = emp[0].getSalary();
        for(Employee elem: emp) {
            if(max < elem.getSalary()) {
                max = elem.getSalary();
            }
        }
        return max;
    }
}
