package com.example.tra.task;

public class UpdateDemo {
    public static void main(String[] args) {


        String currentName = "Muneera";
        String newName = "Reem";
        Boolean status = false;

        System.out.println("Current Student Name :" +currentName);

        if (currentName.equals(newName)){
            System.out.println("No update needed");
        }
        else {
            currentName  = newName;
            status=true;
            System.out.println("Student Name Updated successfully ");
        }
        System.out.println("");


    }

}
