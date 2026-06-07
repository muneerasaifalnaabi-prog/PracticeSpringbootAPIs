package com.example.tra.task;

public class UpdateEmailDemo {
    public static void main(String[] args) {


        String currentEmail = "ahmed@gmail.com";
        String newEmail = "ali@gmail.com";
        boolean updateStatus = false;

        //original Email :
        System.out.println("Current Email :" + currentEmail);

        if (!currentEmail.equalsIgnoreCase(newEmail)) {
            currentEmail = newEmail;
            updateStatus = true;
            System.out.println("Email Updated successfully");
            System.out.println("updated Email : " + currentEmail);
        }
        else {
            System.out.println("No update Required");


        }




    }
}