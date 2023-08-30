package com.example.MothersMilk.Services;
import com.example.MothersMilk.Model.Donation;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public interface DonationService {
    List<Donation> getDonation();
    Donation insertDonation(Donation donation);

}
