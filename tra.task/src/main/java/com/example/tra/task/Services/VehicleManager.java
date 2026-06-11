package com.example.tra.task.Services;

import com.example.tra.task.Entities.Vehicle;
import com.example.tra.task.Repositories.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleManager {

    @Autowired
    VehicleRepository vehicleRepository;

    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    public Vehicle addVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    public Vehicle getVehicleById(Integer id) {
        return vehicleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Vehicle not found"));
    }

    public Vehicle updateVehicle(Integer id, Vehicle updatedVehicle) {

        Vehicle vehicle = getVehicleById(id);

        vehicle.setVehicleModel(updatedVehicle.getVehicleModel());
        vehicle.setRentalPricePerDay(updatedVehicle.getRentalPricePerDay());

        return vehicleRepository.save(vehicle);
    }

    public Boolean deleteVehicle(Integer id) {

        Vehicle vehicle = getVehicleById(id);

        vehicleRepository.delete(vehicle);
        return true;
    }
}