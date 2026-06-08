package com.example.tra.task.Services;

import com.example.tra.task.Entities.Vehicle;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VehicleManager {
    List<Vehicle> vehicles = new ArrayList<>();
}
