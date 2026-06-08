package com.example.tra.task.Services;

import com.example.tra.task.Entities.Vehicle;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VehicleManager {
    List<Vehicle> vehicles = new ArrayList<>();

    public VehicleManager() {
        vehicles.add(new Vehicle("V101", "Toyota Corolla", 20));
        vehicles.add(new Vehicle("V102", "Nissan Sunny", 18));
        vehicles.add(new Vehicle("V103", "Hyundai Elantra", 22));
    }

    public List<Vehicle> getAllVehicles(){
        return vehicles;
    }

}