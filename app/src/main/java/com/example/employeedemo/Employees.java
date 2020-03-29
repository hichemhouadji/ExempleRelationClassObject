package com.example.employeedemo;

public class Employees {

    public String name;
    private double salary;

    public Employees(String employeeName){
        name=employeeName;

    }

    public void setSalary(double salaryEmployee){
        salary=salaryEmployee;
    }

    public void printSalaryEmployee(){
        System.out.println("name is : "+name);
        System.out.println("salary is : "+salary);

    }
}
