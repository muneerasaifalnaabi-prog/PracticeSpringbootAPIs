package com.example.tra.task;

import com.example.tra.task.Entity.Student;
import com.example.tra.task.Entity.UserProfile;

public class UpdateDemo {
    public static void main(String[] args) {
        UserProfile userProfile = new UserProfile(
                "101",
                "0712345678",
                " Muscat, Oman"
        );


        String currentName = "Ahmed";
        String newName = "Ali";
        String status ;

        System.out.println("Current Student Name :" +currentName);

        if (currentName.equals(newName)){
            System.out.println("Names are identical");
            System.out.println("No update is performed");
            status="No Change Required";
        }
        else {
            System.out.println("Names are different");
            System.out.println("Updating student name...");
            currentName  = newName;
            status="Successful";
            System.out.println("Student Name Updated successfully ");
        }

        System.out.println("Current Student Name :" + currentName);
        System.out.println("updated status :" +status);


        Student student = new Student("101", "Ahmed", "A");
        System.out.println("----student's original details----  ");
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Grade: " + student.getGrade());

        student.setStudentName("Ali");

        System.out.println("----student's updated details----  ");
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Grade: " + student.getGrade());


        System.out.println("task6: ===============================================");
        System.out.println("---User Profile---");
        System.out.println("User Id :" +userProfile.getUserId());
        System.out.println("Phone Numbers :"+ userProfile.getPhoneNumber());
        System.out.println("Address :" +userProfile.getAddress());

        userProfile.setPhoneNumber("0798765432");
        userProfile.setAddress(" Ruwi, Muscat ");

        System.out.println("---Update User Profile---");
        System.out.println("User Id :" +userProfile.getUserId());
        System.out.println("Phone Numbers :"+ userProfile.getPhoneNumber());
        System.out.println("Address :" +userProfile.getAddress());


    }
}