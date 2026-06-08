package com.example.tra.task.Controllers;

import com.example.tra.task.Entities.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/employees")
public class EmployeeController {

    List<Employee> employees = new ArrayList<>();


    @GetMapping
    public List<Employee> getAllEmployee() {

        employees.add(new Employee("E101", "Sara", "HR"));
        employees.add(new Employee("E102", "Ahmed", "Finance"));
        employees.add(new Employee("E103", "Ali", "Sales"));

        return employees;

    }
}
