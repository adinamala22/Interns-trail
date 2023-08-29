package com.example.MothersMilk.Repository;
import com.example.MothersMilk.Model.UserLogIn;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserLogInRepository extends JpaRepository<UserLogIn, Integer> {
    UserLogIn findByUserName(String userName);
}
