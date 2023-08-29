package com.example.MothersMilk.Services;

import com.example.MothersMilk.Model.UserLogIn;

import java.util.List;

public interface UserLogInService {
    List<UserLogIn> getLogins();

    UserLogIn getLoginById(Long id);

    UserLogIn insert(UserLogIn logIn);

    void updateLogin(Long id, UserLogIn logIn);

    void deleteLogin(Long todoId);

    String authenticate(String userName, String password);
}
