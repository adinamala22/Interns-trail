package com.example.MothersMilk.Services;

import com.example.MothersMilk.Model.Notification;

import java.util.List;

public interface NotificationService {
    List<Notification> getNotifications();

    Notification insertNotification(Notification notification);
}
