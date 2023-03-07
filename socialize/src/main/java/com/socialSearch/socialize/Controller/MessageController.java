package com.socialSearch.socialize.Controller;

import com.socialSearch.socialize.entity.Message;
import com.socialSearch.socialize.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/messages/")
public class MessageController {
    @Autowired
    private MessageService messageService;
    @PostMapping("register")
    public String createMessage(@RequestBody Message message){
    messageService.createMessage(message);
    return "message saved Successfully";
    }
}