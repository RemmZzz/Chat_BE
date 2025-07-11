package com.example.ChatWeb.service;

import com.example.ChatWeb.model.Message;
import com.example.ChatWeb.repository.MessageRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    private final MessageRepository repo;

    public MessageService(MessageRepository repo) {
        this.repo = repo;
    }

    public Message sendMessage(Message message) {
        return repo.save(message);
    }

    public List<Message> getMessages(String senderId, String receiverId) {
        return repo.findBySenderIdAndReceiverId(senderId, receiverId);
    }
}
