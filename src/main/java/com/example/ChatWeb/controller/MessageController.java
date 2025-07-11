package com.example.ChatWeb.controller;

import com.example.ChatWeb.model.Message;
import com.example.ChatWeb.service.MessageService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
@CrossOrigin
public class MessageController {

    private final MessageService service;

    public MessageController(MessageService service) {
        this.service = service;
    }

    @PostMapping
    public Message sendMessage(@RequestBody Message message) {
        return service.sendMessage(message);
    }

    @GetMapping
    public List<Message> getMessages(
            @RequestParam String senderId,
            @RequestParam String receiverId
    ) {
        return service.getMessages(senderId, receiverId);
    }

}
