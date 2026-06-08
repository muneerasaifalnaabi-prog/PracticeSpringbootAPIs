package com.example.tra.task;

import com.example.tra.task.Entities.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("E101", "Sara", "HR"));
        employees.add(new Employee("E102", "Ahmed", "Finance"));
        employees.add(new Employee("E103", "Ali", "Sales"));


        System.out.println("Employee list");

    }
}
