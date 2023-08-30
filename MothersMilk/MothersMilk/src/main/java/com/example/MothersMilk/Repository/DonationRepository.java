package com.example.MothersMilk.Repository;
import com.example.MothersMilk.Model.UserLogIn;
import com.example.MothersMilk.Model.Donation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DonationRepository extends JpaRepository<Donation, Integer> {
    List<Donation> findByDonor(UserLogIn donor);
    List<Donation> findByRecipient(UserLogIn recipient);
}

