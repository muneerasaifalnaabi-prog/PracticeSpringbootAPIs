package com.example.tra.task.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer empid;
    private String empName;
    private String Department;
    @OneToMany
    List<Campaign> campaigns;
    @OneToMany
    List<Vehicle> vehicles;
}
