package com.example.tra.task.Controllers;

import com.example.tra.task.Entities.Employee;
import com.example.tra.task.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("employee")
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("getAll")
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployee();

    }
    @GetMapping("/getById")
    public Employee getById(@RequestParam Integer id) {
        return employeeService.getEmployeeById(id);
    }

    @GetMapping("/getEmployeeNameById")
    public String getEmployeeNameById(@RequestParam Integer id) {
        return employeeService.getEmployeeNameById(id);
    }

    @PostMapping
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }
    @DeleteMapping("/delete")
    public String deleteEmployee(@RequestParam Integer id) {
        return employeeService.deleteEmployee(id);
    }




}
