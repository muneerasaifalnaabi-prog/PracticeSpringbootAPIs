package com.example.tra.task.Controllers;

import com.example.tra.task.Entities.Employee;
import com.example.tra.task.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("getAll")
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();

    }
    @PostMapping
    public String addEmployee(@RequestBody Employee employee){
        return employeeService.addEmployee(employee);
    }

}
