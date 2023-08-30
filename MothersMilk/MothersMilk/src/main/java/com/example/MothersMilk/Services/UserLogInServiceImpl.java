package com.example.MothersMilk.Services;

import com.example.MothersMilk.Model.UserLogIn;
import com.example.MothersMilk.Repository.UserLogInRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserLogInServiceImpl implements UserLogInService {
    private final UserLogInRepository userRepository;

    @Autowired
    public UserLogInServiceImpl(UserLogInRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<UserLogIn> getLogins() {
        return new ArrayList<>(userRepository.findAll());
    }

    @Override
    public UserLogIn getLoginById(Integer userId) {
        return userRepository.findById(userId).orElse(null);
    }

    @Override
    public UserLogIn insert(UserLogIn logIn) {
        return userRepository.save(logIn);
    }


    @Override
    public void updateProfile(Integer userId ,UserLogIn user) {
        UserLogIn userupdate  = userRepository.findById(userId).get();
        System.out.println(userupdate.toString());
        userupdate.setMedicalReport(user.getMedicalReport());
        userupdate.setDoctorCertificate(user.getDoctorCertificate());
        userupdate.setEmailId(user.getEmailId());
        userRepository.save(userupdate);
    }


    @Override
    public void deleteLogin(Integer userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public List<UserLogIn> getDonorsByAddress(String address) {
        return userRepository.findAllByAccountTypeAndAddressIgnoreCase("donor", address);

    }

    @Override
    public String authenticate(String userName, String password) {
        UserLogIn userLogIn = userRepository.findByUserName(userName);
        if (userLogIn != null && userLogIn.getPassword().equals(password)) {
            return "success";
        } else {
            return "failure";
        }
    }

    @Override
    public List<UserLogIn> getDonors() {
        return userRepository.findAllByAccountType("donor");
    }

    @Override
    public List<UserLogIn> getRecipients() {
        return userRepository.findAllByAccountType("recipient");
    }

}

