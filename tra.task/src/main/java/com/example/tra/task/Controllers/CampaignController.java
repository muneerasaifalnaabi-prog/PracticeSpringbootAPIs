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

    @PostMapping("/addCampaign")
    public String addCampaign(@RequestBody Campaign campaign) {
        return campaignManager.addCampaign(campaign);
    }

    @GetMapping("/getAll")
    public List<Campaign> getAllCampaigns() {
        return campaignManager.getAllCampaigns();
    }

    @GetMapping("/getById")
    public Campaign getCampaignById(@RequestParam Integer id) {
        return campaignManager.getCampaignById(id);
    }

    @PutMapping("/update/{id}")
    public String updateCampaign(@PathVariable Integer id,
                                 @RequestBody Campaign campaign) {
        return campaignManager.updateCampaign(id, campaign);
    }

    @DeleteMapping("/delete")
    public String deleteCampaign(@RequestParam Integer id) {
        return campaignManager.deleteCampaign(id);
    }
}