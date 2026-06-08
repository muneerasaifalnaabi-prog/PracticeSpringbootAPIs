package com.example.tra.task.Controllers;

import com.example.tra.task.Entities.Campaign;
import com.example.tra.task.Services.CampaignManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/campaigns")
public class CampaignController {
    @Autowired
    CampaignManager campaignManager;

    @GetMapping
    public List<Campaign> getAllCampaigns() {
        return campaignManager.getAllCampaigns();
    }

    @PostMapping
    public String addCampaign(@RequestBody Campaign campaign) {
        return campaignManager.addCampaign(campaign);
    }
}
