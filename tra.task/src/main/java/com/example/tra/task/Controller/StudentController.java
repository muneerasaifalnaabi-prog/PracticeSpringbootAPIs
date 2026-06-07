package com.example.tra.task.Controller;

import com.example.tra.task.Entity.Student;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {

    Student student = new Student("101", "Ali", "A");

    @PutMapping("/updateStudent")
    public String updateStudent(@RequestParam String newName) {

        String oldName = student.getStudentName();

        if (!oldName.equals(newName)) {

            student.setStudentName(newName);

            return "Student Name Updated Successfully!\n" +
                    "Student ID: " + student.getStudentId() + "\n" +
                    "Previous Name: " + oldName + "\n" +
                    "New Name: " + student.getStudentName() + "\n" +
                    "Grade: " + student.getGrade();
        }

        return "No update is performed.\n" +
                "Student ID: " + student.getStudentId() + "\n" +
                "Student Name: " + student.getStudentName() + "\n" +
                "Grade: " + student.getGrade();
    }
}
