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
        List<UserLogIn> Logins = new ArrayList<>();
        userRepository.findAll().forEach(Logins::add);
        return Logins;
    }

    @Override
    public UserLogIn getLoginById(Long id) {
        return null; // Implement this method
    }

    @Override
    public UserLogIn insert(UserLogIn logIn) {
        return userRepository.save(logIn);
    }

    @Override
    public void updateLogin(Long id, UserLogIn logIn) {
        // Implement this method
    }

    @Override
    public void deleteLogin(Long userId) {
        // Implement this method
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
}
