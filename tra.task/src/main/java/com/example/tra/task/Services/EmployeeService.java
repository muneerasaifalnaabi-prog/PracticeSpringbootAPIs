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

 //getall
    public List<Employee> getAllEmployee() {

        return employeeRepository.findAll();

    }

    public Employee addEmployee(Employee newEmployee) {
        if (employeeRepository.existsById(newEmployee.getEmpid())) {
           throw new RuntimeException(
                   "Employee ID is Already exist"
           );
        }
        return employeeRepository.save(newEmployee);
    }
    //update :
    public Employee updateEmployee(Integer id,String name, String department) {
        Employee employee = employeeRepository.findById(id).get();
        employee.setEmpName(name);
        employee.setDepartment(department);
        return employeeRepository.save(employee);
    }

    //Delete :

    public String deleteEmployee(Integer id){
        if (employeeRepository.existsById(id)){
            return "ID NOT FOUND";
        }
        employeeRepository.deleteById(id);

        return "DELETED";
    }


    public Employee getEmployeeById(Integer id) {
        return employeeRepository.findById(id).get();
    }

    public String getEmployeeNameById(Integer id) {
        return employeeRepository.findById(id).get().getEmpName();
    }



}

