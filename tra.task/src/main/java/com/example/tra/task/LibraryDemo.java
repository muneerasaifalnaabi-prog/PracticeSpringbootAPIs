package com.example.tra.task;

import com.example.tra.task.Entity.LibraryManager;

public class LibraryDemo {
    public static void main(String[] args) {

        LibraryManager manager = new LibraryManager();
        manager.initializeMembers();

        System.out.println("Before Deletion :");
        manager.displayMembers();

        String memberId = "M102";
        if (manager.deleteMemberById(memberId)) {
            System.out.println("Member " + memberId + " deleted successfully.");
        } else {
            System.out.println("Member not found.");
        }

        System.out.println("After Deletion:");
        manager.displayMembers();
    }


}

