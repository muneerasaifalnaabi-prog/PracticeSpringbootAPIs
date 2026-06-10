package com.example.tra.task.Demo;

import com.example.tra.task.Entities.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(101, "Sara", "HR",new ArrayList<>(),new ArrayList<>()));
        employees.add(new Employee(102, "Ahmed", "Finance", new ArrayList<>(),new ArrayList<>()));
        employees.add(new Employee(103, "Ali", "Sales", new ArrayList<>(),new ArrayList<>()));


        System.out.println("Employee list");
       // System.out.println(employees);

        for (Employee e: employees){
            System.out.println(e);
        }

        Employee employee = new Employee(104, "Ahmed Ali", "IT",new ArrayList<>(),new ArrayList<>());

        Boolean exists = false;

        for (Employee e : employees) {
            if (e.getEmpid().equals(employee.getEmpid())) {
                exists = true;
                break;
            }
        }
        if (exists) {
            System.out.println("Employee ID already exists ");
        } else {
            employees.add(employee);

            System.out.println("Employee Added Successfully ");
            System.out.println("Employee ID :" + employee.getEmpid());
            System.out.println("Employee Name :" + employee.getEmpName());
            System.out.println("Department :" + employee.getDepartment());
        }

        System.out.println("New Employee List :");
        //System.out.println(employees);

        for (Employee e: employees){
            System.out.println(e);
        }

    }
}
