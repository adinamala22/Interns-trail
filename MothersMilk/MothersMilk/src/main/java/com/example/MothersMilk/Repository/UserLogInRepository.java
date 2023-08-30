package com.example.MothersMilk.Repository;
import com.example.MothersMilk.Model.UserLogIn;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface UserLogInRepository extends JpaRepository<UserLogIn, Integer> {
    UserLogIn findByUserName(String userName);
    List<UserLogIn> findAllByAccountType(String accountType);
    List<UserLogIn> findAllByAccountTypeAndAddressIgnoreCase(String accountType, String address);
}
