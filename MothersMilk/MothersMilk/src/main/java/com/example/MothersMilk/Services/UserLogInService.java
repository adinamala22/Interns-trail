package com.example.MothersMilk.Services;

import com.example.MothersMilk.Model.UserLogIn;

import java.util.List;

public interface UserLogInService {
    List<UserLogIn> getLogins();

    UserLogIn getLoginById(Integer userId);

    UserLogIn insert(UserLogIn logIn);

    void updateProfile(Integer userId, UserLogIn user);

    void deleteLogin(Integer userId);

    List<UserLogIn> getDonorsByAddress(String address);


    String authenticate(String userName, String password);

    List<UserLogIn> getDonors();

    List<UserLogIn> getRecipients();
}
