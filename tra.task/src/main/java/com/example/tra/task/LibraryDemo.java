package com.example.tra.task;

import com.example.tra.task.Entity.LibraryManager;

public class LibraryDemo {
    public static void main(String[] args) {

        LibraryManager manager = new LibraryManager();
        manager.initializeMembers();

        System.out.println("Before Deletion :");
        manager.displayMembers();


    }
}
