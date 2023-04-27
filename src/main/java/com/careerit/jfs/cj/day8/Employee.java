package com.careerit.jfs.cj.day8;

public class Employee {
    int empNo;
    String ename;
    double salary;
    public Employee(int empNo, String ename, double salary) {
        this.empNo = empNo;
        this.ename = ename;
        this.salary = salary;
    }
    public void showDetails() {
        System.out.println(empNo+" "+ename+" "+salary);
    }

    public int getEmpNo() {
        return empNo;
    }

    public void setEmpNo(int empNo) {
        this.empNo = empNo;
    }

    public String getEname() {
        return ename;
    }

    public double getSalary() {
        return salary;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
