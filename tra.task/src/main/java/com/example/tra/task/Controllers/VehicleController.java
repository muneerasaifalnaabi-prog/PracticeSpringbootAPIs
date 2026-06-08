package com.example.tra.task.Controllers;


import com.example.tra.task.Entities.Vehicle;
import com.example.tra.task.Services.VehicleManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {
    @Autowired
    VehicleManager vehicleManager;

    @GetMapping
    public List<Vehicle> getAllVehicles() {
        return vehicleManager.getAllVehicles();
    }

    @PostMapping
    public String addVehicle(@RequestBody Vehicle vehicle) {
        return vehicleManager.addVehicle(vehicle);
    }
}




