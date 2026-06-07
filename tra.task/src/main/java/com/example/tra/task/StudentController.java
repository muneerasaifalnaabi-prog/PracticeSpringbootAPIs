package com.example.tra.task;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {

    Student student = new Student("101", "Ali", "A");

    @PutMapping("/updateStudent")
    public String updateStudent(@RequestParam String newName) {
        String oldName = student.getStudentName();
        student.setStudentName(newName);
        return "Student Name Updated Successfully! \n " +
                "Student ID: " + student.getStudentId() + "\n" +
                "New Student Name:  " + student.getStudentName() + "\n" +
                " Grade :" + student.getGrade();
    }
}
