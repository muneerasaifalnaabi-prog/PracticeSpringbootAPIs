package com.example.tra.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentController {
    @Autowired
    Student student = new Student();

    @GetMapping("/updateStudent ")
    public String updateStudent(@RequestParam String newName){
        String oldName= student.getStudentName();
        student.setStudentName(newName);
        return ""
    }
}
