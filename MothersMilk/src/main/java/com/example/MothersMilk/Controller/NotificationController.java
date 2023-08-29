package com.example.MothersMilk.Controller;

import com.example.MothersMilk.Model.Notification;
import com.example.MothersMilk.Services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/notifications")
public class NotificationController {
    private final NotificationService notificationService;

    @Autowired
    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @PostMapping
    public ResponseEntity<Notification> saveNotification(@RequestBody Notification notification) {
        Notification notification1 = notificationService.insertNotification(notification);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Notification", "/api/v1/notification/" + notification1.getNotificationId().toString());
        return new ResponseEntity<>(notification1, httpHeaders, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Notification>> getNotification() {
        List<Notification> notifications = notificationService.getNotifications();
        return new ResponseEntity<>(notifications, HttpStatus.OK);
    }
}
