package com.example.tra.task.Entity;

import java.util.ArrayList;

public class LibraryManager {
    private ArrayList<LibraryMember> members= new ArrayList<>();

    public void  initializeMembers(){
        members.add(new LibraryMember("M101", "Ahmed", "Standard"));
        members.add(new LibraryMember("M102", "Sara", "Premium"));
        members.add(new LibraryMember("M103", "John", "Standard"));

    }
    public void addMember(LibraryMember member){
        members.add(member);
    }

    public void displayMembers() {
        System.out.println("Library Members");
        if (members.isEmpty()){
            System.out.println("No members found ");
        }
        for (LibraryMember member :members)


    }


}
