package com.udacity.jwdnd.c1.review.models;

public class ChatMessage {
    private String username;
    private String messageText;

    // get username and set the username
    public String getUsername() {
        return this.username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    // get message Text and set the message text
    public String getMessageText() {
        return this.messageText;
    }
    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }
}
