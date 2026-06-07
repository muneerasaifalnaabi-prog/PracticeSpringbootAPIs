package com.example.tra.task;

public class UpdateDemo {
    public static void main(String[] args) {


        String name = "Muneera";
        String newName = "Reem";
        Boolean status = false;

        System.out.println("Current Student Name :" +name);

        if (name.equals(newName)){
            System.out.println("No update needed");
        }
        else {
            name  = newName;
            status=true;


        }

    }

}
