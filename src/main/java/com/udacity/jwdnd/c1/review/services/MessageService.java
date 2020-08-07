package com.udacity.jwdnd.c1.review.services;

import com.udacity.jwdnd.c1.review.models.ChatForm;
import com.udacity.jwdnd.c1.review.models.ChatMessage;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService {
//    private String message;
    private List<ChatMessage> chatMessages;

//    public MessageService(String message) {
//        this.message = message;
//    }

//    // upper case method that returns message as uppercase
//    public String upperCase() {
//        return this.message.toUpperCase();
//    }
//
//    // lower case method that returns message as lower case
//    public String lowerCase() {
//        return this.message.toLowerCase();
//    }

    public void addMessage(ChatForm chatForm) {
        ChatMessage newMessage = new ChatMessage();
        newMessage.setUsername(chatForm.getUsername());

        switch (chatForm.getMessageType()) {
            case "Say":
                newMessage.setMessageText(chatForm.getMessageText());
                break;
            case "Shout":
                newMessage.setMessageText(chatForm.getMessageText().toUpperCase());
                break;
            case "Whisper":
                newMessage.setMessageText(chatForm.getMessageText().toLowerCase());
                break;
        }
        this.chatMessages.add(newMessage);
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Creating message bean!");
        this.chatMessages = new ArrayList<>();
    }

    public List<ChatMessage> getChatMessages() {
        return chatMessages;
    }
}
