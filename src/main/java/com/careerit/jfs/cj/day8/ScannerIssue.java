package com.careerit.jfs.cj.day8;

import java.util.Scanner;

public class ScannerIssue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the empno: ");
        int empno = sc.nextInt();

        System.out.println("Enter the name: ");
        String name = sc.nextLine();

        System.out.println("Enter the salary: ");
        double salary = sc.nextDouble();

        Employee emp = new Employee(empno, name, salary);
        emp.showDetails();
    }
}
