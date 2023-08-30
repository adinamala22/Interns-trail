package com.example.MothersMilk.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.MothersMilk.Model.Conversation;

public interface ConversationRepository extends JpaRepository<Conversation,Integer>{

}