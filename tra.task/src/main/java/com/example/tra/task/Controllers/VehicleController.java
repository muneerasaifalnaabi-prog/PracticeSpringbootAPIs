package com.example.tra.task.Controllers;


import com.example.tra.task.Services.VehicleManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vehicles")
public class VehicleController {
    @Autowired
    VehicleManager  vehicleManager;



}
