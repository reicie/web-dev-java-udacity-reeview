package com.udacity.jwdnd.c1.review.models;

public class ChatForm {
    private String username;
    private String messageText;
    private String messageType;

    // get username and set it
    public String getUsername() {
        return this.username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    // get message Text and set message Text
    public String getMessageText() {
        return this.messageText;
    }
    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    // get message Type and set message type
    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }
}
