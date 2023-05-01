package com.careerit.jfs.cj.day11;

import java.util.Arrays;
import java.util.List;

public class StringAssignment2 {
    public static void main(String[] args) {
        String inputStr = "Learning java is fun. To have fun learn java, and SQL:";
        System.out.println(getWords(inputStr));
        System.out.println(isPalindrome(inputStr));
        System.out.println(isPalindrome("1223221"));
        System.out.println(isPalindrome("456"));
        System.out.println(maskAccountNumber("987654321"));
        System.out.println(isAnagram("CAT", "ACT"));
        generateWords("lester", 3);
    }

    public static void generateWords(String data, int n) {
        if(n >= data.length()) {
            System.out.println(data);
        } else {//lester, 3
            for(int i = 0; i <= data.length()-n; i++) {
                System.out.println(data.substring(i, i+n));
            }
        }
    }

    public static boolean isAnagram(String str1, String str2) {
        if(str1.length() != str2.length()) {
            return false;
        }
        char [] arr1 = str1.toCharArray();
        char [] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static String maskAccountNumber(String acctNumber) {
        return "*********" + acctNumber.substring(acctNumber.length()-4);
    }

    public static boolean isPalindrome(String data) {
        char [] arr = data.toCharArray();
        for(int i = 0, j = arr.length-1; i <=j; i++, j--) {
            if(arr[i] != arr[j]) return false;
        }
        return true;
    }

    public static List<String> getWords(String data) {
        String [] specialChars = new String[]{"\\.", ",", ":"};
        for(String ch: specialChars) {
            data = data.replaceAll(ch, "");
        }
        System.out.println(data);
        //data.replaceAll(",", "");
        String [] arr = data.split(" ");
        //remove commas and spaces
        return Arrays.asList(arr);
    }
}
