package com.example.MothersMilk.Services;

import com.example.MothersMilk.Model.Donation;
import com.example.MothersMilk.Repository.DonationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service

public class DonationServiceImpl implements DonationService{
    @Autowired
    DonationRepository donationRepository;
    public DonationServiceImpl(DonationRepository donationRepository){
        this.donationRepository=donationRepository;
    }
    @Override
    public List<Donation> getDonation() {
        List<Donation> donations = new ArrayList<>();
        donationRepository.findAll().forEach(donations::add);
        return donations;
    }

    @Override
    public Donation insertDonation(Donation donation) {
        return donationRepository.save(donation);
    }

}
