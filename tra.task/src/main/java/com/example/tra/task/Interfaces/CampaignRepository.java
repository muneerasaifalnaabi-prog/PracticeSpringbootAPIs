package com.example.tra.task.Interfaces;

import com.example.tra.task.Entities.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CampaignRepository extends JpaRepository<Campaign,Integer> {
    @Query("select c from Campaign c where c.campaignName = :campaignName")
    Campaign getCampaignByName(@Param("campaignName") String campaignName);
}
