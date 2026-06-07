package com.example.tra.task;

public class UpdateDemo {
    public static void main(String[] args) {

/*  Task 26
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
*/

        Student student = new Student("101", "Ahmed", "A");
        System.out.println("----student's original details----  ");
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Grade: " + student.getGrade());


    }
}