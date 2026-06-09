package com.example.tra.task.Services;

import com.example.tra.task.Entities.Vehicle;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VehicleManager {
    List<Vehicle> vehicles = new ArrayList<>();

    public VehicleManager() {
        vehicles.add(new Vehicle(1, "Toyota Corolla", 20));
        vehicles.add(new Vehicle(2, "Nissan Sunny", 18));
        vehicles.add(new Vehicle(3, "Hyundai Elantra", 22));
    }

    public List<Vehicle> getAllVehicles(){
        return vehicles;
    }
    public String addVehicle(Vehicle vehicle) {
        for (Vehicle v : vehicles) {
            if (v.getVehicleId().equals(vehicle.getVehicleId())) {
                return "Vehicle ID already exists. No vehicle was added.";
            }
        }

        vehicles.add(vehicle);

        return "Vehicle Added Successfully\n" +
                "Vehicle ID: " + vehicle.getVehicleId() + "\n" +
                "Vehicle Model: " + vehicle.getVehicleModel() + "\n" +
                "Rental Price Per Day: " + vehicle.getRentalPricePerDay() + " OMR";
    }
    }


