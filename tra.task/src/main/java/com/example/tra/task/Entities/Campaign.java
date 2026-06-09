package com.example.tra.task.Entities;


import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Campaign {
    private String campaignId;
    private String campaignName;
    private String platform;
    private double budget;

}
