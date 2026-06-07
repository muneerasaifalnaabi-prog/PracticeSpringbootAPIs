package com.example.tra.task;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {

    Student student = new Student("101", "Ali", "A");

    @PutMapping("/updateStudent")
    public String updateStudent(@RequestParam String newStudent) {
        System.out.println(" The Current Student Name" +student.getStudentName());
        if (!student.getStudentName().equals(newStudent)){
            System.out.println("Student name Updated Successfully!");
            System.out.println("Student ID :"+student.getStudentId());
            System.out.println("student name : "+newStudent);
            System.out.println("Student Grade : " +student.getGrade());
        }

    }
}
