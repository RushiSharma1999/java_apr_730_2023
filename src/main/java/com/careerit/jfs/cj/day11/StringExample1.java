package com.careerit.jfs.cj.day11;

public class StringExample1 {
    public static void main(String[] args) {
        String name1 = "Core Java";
        String name2 = "core Java";
        String name3 = name2; //we are giving the alias name for name2
        String name4 = "core java"; //pointing to the same object as name2
        System.out.println(name1 == name2); //compares the two reference variables\
        System.out.println(name1 == name3);
        System.out.println(name2 == name4);
        System.out.println(name3 == name4);
    }
}
