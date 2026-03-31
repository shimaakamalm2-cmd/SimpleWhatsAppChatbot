package org.example.simplewhatsappchatbot;

import org.springframework.stereotype.Service;

@Service
public class ChatbotService {
    //this is to send the replies
    public String replyToMessage(Message message) {
        String text = message.getText().trim();
        if(text.equalsIgnoreCase("hi")){
            return "Hello";
        }else if(text.equalsIgnoreCase("bye")){
            return "GoodBye";
        } else {
            return "failed to process message";
        }
    }
}
