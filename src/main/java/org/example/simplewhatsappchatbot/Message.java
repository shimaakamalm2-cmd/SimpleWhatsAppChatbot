package org.example.simplewhatsappchatbot;

public class Message {
    private String text;
    private  String sender;
    public Message(String message, String sender) {
        this.text = message;
        this.sender = sender;
    }

    public String getText() {
        return text;
    }

    public void setText(String message) {
        this.text = message;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    @Override
    public String toString() {
        return "{ text:'" + text + '\'' +
                ", sender:'" + sender + '\'' +
                '}';
    }

}
