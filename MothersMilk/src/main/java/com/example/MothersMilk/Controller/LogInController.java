package com.example.MothersMilk.Controller;

import com.example.MothersMilk.Model.UserLogIn;
import com.example.MothersMilk.Services.UserLogInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/login")
public class LogInController {
    @Autowired
    UserLogInService userLogInService;
    public LogInController(UserLogInService userLogInService){
        this.userLogInService=userLogInService;
    }

    @PostMapping
    public ResponseEntity<UserLogIn> saveLogIn(@RequestBody @Validated UserLogIn LogIn) {
        UserLogIn LogIn1 = userLogInService.insert(LogIn);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("LogIn", "/api/v1/login/" + LogIn1.getUserId().toString());
        return new ResponseEntity<>(LogIn1, httpHeaders, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<UserLogIn>> getAllTodos() {
        List<UserLogIn> todos = userLogInService.getLogins();
        return new ResponseEntity<>(todos, HttpStatus.OK);
    }
    @PostMapping("/authenticate")
    public ResponseEntity<String> authenticate(@RequestBody UserLogIn loginRequest) {
        String response = userLogInService.authenticate(loginRequest.getUserName(), loginRequest.getPassword());

        if ("success".equals(response)) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid login data");
        }
    }
}
