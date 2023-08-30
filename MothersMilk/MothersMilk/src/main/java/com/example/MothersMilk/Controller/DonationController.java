package com.example.MothersMilk.Controller;
import com.example.MothersMilk.Model.UserLogIn;
import com.example.MothersMilk.Services.UserLogInService;
import com.example.MothersMilk.Model.Donation;
import com.example.MothersMilk.Services.DonationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/donations")
public class DonationController {
    @Autowired
    DonationService donationService;

    @Autowired
    UserLogInService userLogInService;

    public DonationController(DonationService donationService, UserLogInService userLogInService) {
        this.donationService = donationService;
        this.userLogInService = userLogInService;
    }

    @PostMapping
    public ResponseEntity<Donation> saveDonations(@RequestBody @Validated Donation donation) {
        UserLogIn donor = userLogInService.getLoginById(donation.getDonor().getUserId());
        UserLogIn recipient = userLogInService.getLoginById(donation.getRecipient().getUserId());

        if (donor == null || recipient == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null); // Handle the error case
        }

        donation.setDonor(donor);
        donation.setRecipient(recipient);

        Donation donationResult = donationService.insertDonation(donation);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Donation", "/api/v1/donations/" + donationResult.getDonListId().toString());
        return new ResponseEntity<>(donationResult, httpHeaders, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Donation>> getAllDonations() {
        List<Donation> donation = donationService.getDonation();
        return new ResponseEntity<>(donation, HttpStatus.OK);
    }
}

