package com.careerit.jfs.cj.day4;

public class NestedForLoop {

    public static void main(String[] args) {
        for(int i = 1; i <= 20; i++) {
            int num = i;
            for (int j = 1; j <= 10; j++) {
                System.out.println(num + " * " + j + " = " + num * j);
            }
            System.out.println("--------------------------");
        }
    }
}
