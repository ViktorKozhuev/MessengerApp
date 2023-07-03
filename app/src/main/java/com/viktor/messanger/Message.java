package com.viktor.messanger;

public class Message {

    private String text;
    private String senderId;
    private String receiverId;
    private Boolean isRead;

    public Message(String text, String senderId, String receiverId, Boolean isRead) {
        this.text = text;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.isRead = isRead;
    }

    public Message(String text, String senderId, String receiverId) {
        this.text = text;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.isRead = false;
    }

    public Message() {
    }

    public String getText() {
        return text;
    }

    public String getSenderId() {
        return senderId;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public Boolean getRead() {
        return isRead;
    }
}


