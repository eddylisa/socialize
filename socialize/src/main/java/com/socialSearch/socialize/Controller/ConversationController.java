package com.socialSearch.socialize.Controller;

import com.socialSearch.socialize.entity.Conversation;
import com.socialSearch.socialize.services.ConversationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/conversations/")
public class ConversationController {
   @Autowired
    private ConversationService conversationService;
    @PostMapping("register")
public String saveConversation(@RequestBody Conversation conversation){
    conversationService.saveConversation(conversation);
    return "conversation saved successfully";
}
}
