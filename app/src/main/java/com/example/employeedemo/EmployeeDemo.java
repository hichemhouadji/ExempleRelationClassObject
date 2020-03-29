package com.example.employeedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class EmployeeDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Employees omaremloyee= new Employees("omar");
        omaremloyee.setSalary(5000);
        omaremloyee.printSalaryEmployee();

    }

}
