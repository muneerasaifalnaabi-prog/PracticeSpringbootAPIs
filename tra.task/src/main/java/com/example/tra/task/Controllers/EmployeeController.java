package com.example.tra.task.Controllers;

import com.example.tra.task.Entities.Employee;
import com.example.tra.task.Services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/employees")
public class EmployeeController {
    EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployee() {
        return employees;

    }
    @PostMapping
    public String addEmployee(@RequestBody Employee employee){}

}
