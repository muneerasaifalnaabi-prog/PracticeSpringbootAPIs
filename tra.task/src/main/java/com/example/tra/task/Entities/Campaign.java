package com.example.tra.task.Entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Campaign {
    private String campaignId;
    private String campaignName;
    private String platform;
    private double budget;

}
