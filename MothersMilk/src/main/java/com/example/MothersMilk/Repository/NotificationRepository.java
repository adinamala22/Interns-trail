package com.example.MothersMilk.Repository;

import com.example.MothersMilk.Model.Notification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificationRepository extends JpaRepository<Notification,Integer> {
}
