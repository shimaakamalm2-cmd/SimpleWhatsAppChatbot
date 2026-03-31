package org.example.simplewhatsappchatbot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatbotController {
    ChatbotService chatbotService;
    private static final Logger logger = LoggerFactory.getLogger(ChatbotController.class);

    public ChatbotController(ChatbotService chatbotService) {
        this.chatbotService = chatbotService;
    }

    @PostMapping("/webhook")
    public String sendMessage(@RequestBody Message message){
        logger.info("Received message from {}: {}" , message.getSender(), message.getText());
        return chatbotService.replyToMessage(message);
    }

}
