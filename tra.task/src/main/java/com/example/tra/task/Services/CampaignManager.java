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
                return "Campaign ID already exists.";
            }
        }

        campaigns.add(newCampaign);
        return "Campaign Created Successfully";
    }

    public Campaign getCampaignById(Integer id) {

        if (id == null) {
            throw new RuntimeException("Campaign ID cannot be null");
        }

        for (Campaign campaign : campaigns) {
            if (campaign.getCampaignId().equals(id)) {
                return campaign;
            }
        }

        throw new RuntimeException("Campaign not found");
    }

    public String updateCampaign(Integer id, Campaign updatedCampaign) {

        Campaign campaignToUpdate = getCampaignById(id);

        campaignToUpdate.setCampaignName(updatedCampaign.getCampaignName());
        campaignToUpdate.setPlatform(updatedCampaign.getPlatform());
        campaignToUpdate.setBudget(updatedCampaign.getBudget());

        return "Campaign Updated Successfully";
    }

    public String deleteCampaign(Integer id) {

        Campaign campaign = getCampaignById(id);

        if (campaign != null) {
            campaigns.remove(campaign);
            return "Campaign Deleted Successfully";
        }

        return "Campaign Not Found";
    }
}