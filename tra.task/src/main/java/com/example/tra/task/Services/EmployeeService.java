package com.example.tra.task.Services;

import com.example.tra.task.Entities.Employee;
import com.example.tra.task.Interfaces.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;


    public List<Employee> getAllEmployee() {

        return employeeRepository.findAll();

    }

    public Employee addEmployee(Employee newEmployee) {
        if (employeeRepository.existsById(newEmployee.getEmpid())) {
            System.out.println("employee ID Already Exits");
        }

        return employeeRepository.save(newEmployee);


    }
}

