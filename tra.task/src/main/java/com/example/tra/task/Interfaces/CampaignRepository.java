package com.example.tra.task.Interfaces;

import com.example.tra.task.Entities.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampaignRepository extends JpaRepository<Campaign,Integer> {
}
