package com.example.tra.task.Services;

import com.example.tra.task.Entity.EventRegistration;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegistrationService {
    Map<Integer, EventRegistration> registrations = new HashMap<>();

    public RegistrationService(){
        loadSampleData();
    }
    public void loadSampleData() {
        registrations.put(101, new EventRegistration(101, "Ahmed"));
        registrations.put(102, new EventRegistration(102, "Sara"));
        registrations.put(103, new EventRegistration(103, "John"));
        registrations.put(104, new EventRegistration(104, "Ali"));
    }
    public Map<String, Object> deleteMultipleByIds(List<Integer> ids) {
        List<Integer> deletedIds = new ArrayList<>();
        List<Integer> notFoundIds = new ArrayList<>();


    }


}
