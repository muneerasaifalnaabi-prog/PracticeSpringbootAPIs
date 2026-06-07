package com.example.tra.task;

import java.util.ArrayList;

public class DeleteTaskDemo {
    public static void main(String[] args) {


        ArrayList<String> tasks = new ArrayList<>();

        tasks.add("Buy groceries");
        tasks.add("Call doctor");
        tasks.add("Finish report");

        System.out.println("Task List :: ");
        for (String task :tasks){
            System.out.println("- " + task);
        }
        String targetTask="Call doctor";


    }
}