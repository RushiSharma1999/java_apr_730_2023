package com.careerit.jfs.cj.day10;

import java.util.ArrayList;
import java.util.List;

public class ArrayExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);
        System.out.println(list.size());
        list.remove(2);
        System.out.println(list.size());
        list.set(1, 20);
        System.out.println(list);

        List<String> names = new ArrayList<>();
        names.add("Rushi");
        names.add("Manoj");
        names.add("Soham");
        System.out.println(names);

        System.out.println(names.get(1));
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }
        System.out.println();

        for(String name: names) {
            System.out.println(name);
        }
        System.out.println(names.isEmpty());
    }
}
