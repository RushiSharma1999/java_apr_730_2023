package com.careerit.jfs.cj.day11;

public class StringFormatExample {

    public static void main(String[] args) {
        String name = "Rushi";
        float age = 23.2f;
        double salary = 180000;

        System.out.println(name+", "+age+", "+salary);
        System.out.println(String.format("%s,%s,%s",name,age,salary));
    }
}
