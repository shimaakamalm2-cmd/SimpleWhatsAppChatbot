package org.example.simplewhatsappchatbot;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatbotController {
    ChatbotService chatbotService;
    public ChatbotController(ChatbotService chatbotService) {
        this.chatbotService = chatbotService;
    }
    @PostMapping("/webhook")
    public String sendMessage(@RequestBody Message message){
        return chatbotService.replyToMessage(message);
    }
}
