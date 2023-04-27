package com.careerit.jfs.cj.day11;

public class StringClassMethods {
    public static void main(String[] args) {
        String[] names = new String[] {"Krish", "Manoj", "Charan"};
        String message = String.join(",",names);
        System.out.println(message);
        String name = "Hello";
        System.out.println(name.toUpperCase()); //creates a temporary object which is uppercase, does not change the original object
        System.out.println(name.toLowerCase());
        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name);

        for(int i=0; i<name.length(); i++) {
            System.out.println(name.charAt(i) + " ");
        }

        for(int i=name.length()-1; i>=0; i--) {
            System.out.println(name.charAt(i) + " ");
        }

        System.out.println();
        String data = " Hello ";
        System.out.println(data.length());
        System.out.println(data.trim().length());

        String info = "INFYMANOJ";
        String brand = info.substring(0,4);
        System.out.println(brand);
        String brand1 = info.substring(4);
        System.out.println(brand1);
        String brand2 = info.substring(4, 7);
        System.out.println(brand2);//from starting index to end index-1

        String data1 = "HI WELCOME TO JAVA WORLD";
        int len = data1.substring(3,11).toLowerCase().trim().substring(3).length();
        System.out.println(data1.substring(3,11).toLowerCase().trim());
        System.out.println(data1.substring(3,11).toLowerCase().trim().substring(3));
        System.out.println(len);
    }

}
