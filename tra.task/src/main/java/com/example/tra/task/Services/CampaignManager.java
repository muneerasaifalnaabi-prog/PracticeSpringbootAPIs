package com.example.tra.task.Services;

import com.example.tra.task.Entities.Campaign;
import com.example.tra.task.Interfaces.CampaignRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CampaignManager {

    @Autowired
    CampaignRepository campaignRepository;

    public Campaign addCampaign(Campaign campaign) {
        return campaignRepository.save(campaign);
    }

    public List<Campaign> getAllCampaigns() {
        return campaignRepository.findAll();
    }

    public Campaign getCampaignById(Integer id) {
        return campaignRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Campaign not found"));
    }

    public Campaign getCampaignByName(String name) {
        return campaignRepository.getCampaignByName(name);
    }

    public Campaign updateCampaign(Integer id, Campaign updatedCampaign) {

        Campaign campaign = getCampaignById(id);

        campaign.setCampaignName(updatedCampaign.getCampaignName());
        campaign.setPlatform(updatedCampaign.getPlatform());
        campaign.setBudget(updatedCampaign.getBudget());

        return campaignRepository.save(campaign);
    }

    public Boolean deleteCampaign(Integer id) {

        Campaign campaign = getCampaignById(id);

        campaignRepository.delete(campaign);
        return true;
    }
}