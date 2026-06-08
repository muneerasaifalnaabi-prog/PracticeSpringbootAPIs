package com.example.tra.task.Services;

import com.example.tra.task.Entities.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private List<Employee> employees = new ArrayList<>();


    public List<Employee> getAllEmployee(){
        employees.add(new Employee("E101", "Sara", "HR"));
        employees.add(new Employee("E102", "Ahmed", "Finance"));
        employees.add(new Employee("E103", "Ali", "Sales"));

        return employees;

    }

    public String addEmployee(Employee newEmployee) {

        for (Employee employee : employees) {
            if (employee.getEmpid().equals(newEmployee.getEmpid())) {
                return "Employee ID already exists. No employee was created.";
            }
        }

        employees.add(newEmployee);

        return "Employee Added Successfully\n" +
                "Employee ID: " + newEmployee.getEmpid() + "\n" +
                "Employee Name: " + newEmployee.getEmpName() + "\n" +
                "Department: " + newEmployee.getDepartment() + "\n" +
                "Status: Created";
    }

}
