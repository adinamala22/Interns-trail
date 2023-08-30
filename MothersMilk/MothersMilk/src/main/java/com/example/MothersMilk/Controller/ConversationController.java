package com.example.MothersMilk.Controller;

import com.example.MothersMilk.Model.Conversation;
import com.example.MothersMilk.Services.ConversationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/conversation")
public class ConversationController {
    @Autowired
    ConversationService conversationService;




    @PostMapping("/conversation")
    public ResponseEntity<Conversation> saveConversation(@RequestBody @Validated Conversation conversation) {
        Conversation savedConversation = conversationService.insert(conversation);
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add("Conversation", "/api/v1/conversation/" + savedConversation.getConversationId().toString());
        return new ResponseEntity<>(savedConversation, httpHeaders, HttpStatus.CREATED);
    }

    @GetMapping("/conversation")
    public ResponseEntity<List<Conversation>> getAllConversations() {
        List<Conversation> conversations = conversationService.getAllConversations();
        return new ResponseEntity<>(conversations, HttpStatus.OK);
    }
}

