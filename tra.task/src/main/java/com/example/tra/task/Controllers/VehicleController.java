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

    @PostMapping("/addVehicle")
    public String addVehicle(@RequestBody Vehicle vehicle) {
        return vehicleManager.addVehicle(vehicle);
    }

    @GetMapping("/getAll")
    public List<Vehicle> getAllVehicles() {
        return vehicleManager.getAllVehicles();
    }

    @GetMapping("/getById")
    public Vehicle getVehicleById(@RequestParam Integer id) {
        return vehicleManager.getVehicleById(id);
    }

    @PutMapping("/update/{id}")
    public String updateVehicle(@PathVariable Integer id,
                                @RequestBody Vehicle vehicle) {
        return vehicleManager.updateVehicle(id, vehicle);
    }

    @DeleteMapping("/delete")
    public String deleteVehicle(@RequestParam Integer id) {
        return vehicleManager.deleteVehicle(id);
    }
}