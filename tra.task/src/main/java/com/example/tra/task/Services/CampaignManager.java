package com.example.tra.task.Services;

import com.example.tra.task.Entities.Campaign;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CampaignManager {
    private List<Campaign> campaigns = new ArrayList<>();

    public CampaignManager() {
        campaigns.add(new Campaign(1, "Summer Sale", "Instagram", 500));
        campaigns.add(new Campaign(2, "Black Friday", "Google Ads", 1000));
        campaigns.add(new Campaign(3, "Email Promo", "Email", 300));
    }


    public List<Campaign> getAllCampaigns() {
        return campaigns;
    }

    public String addCampaign(Campaign newCampaign) {

        for (Campaign campaign : campaigns) {
            if (campaign.getCampaignId().equals(newCampaign.getCampaignId())) {
                return "Campaign ID already exists. No campaign was created.";
            }
        }

        campaigns.add(newCampaign);

        return "Campaign Created Successfully\n" + "Campaign ID: " + newCampaign.getCampaignId() + "\n" + "Campaign Name: " + newCampaign.getCampaignName() + "\n" + "Platform: " + newCampaign.getPlatform() + "\n" + "Budget: " + newCampaign.getBudget();
    }


}
