package com.careerit.jfs.cj.day11;

import java.time.LocalDate;

public class EmployeeInformation {
    public static void main(String[] args) {
        String name = "Rushi";
        String project = "CSK";
        LocalDate dob = LocalDate.of(1999, 8, 29);
        double salary = 180000;
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" ").append(project).append(" ").append(dob).append(" ").append(salary);
        String data = sb.toString();
        System.out.println(data);

        StringBuilder sb1 = new StringBuilder();

        String str = "LIRIL";

        StringBuilder sb2 = new StringBuilder(str);
        sb2.reverse();
    }

    public static boolean isPalidrome(String str) {
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}
