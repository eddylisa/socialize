package com.socialSearch.socialize.services;

import com.socialSearch.socialize.entity.Message;
import com.socialSearch.socialize.repositoty.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService{
    @Autowired
    private MessageRepository messageRepository;
    @Override
    public Message createMessage(Message message) {
        return messageRepository.save(message);
    }
}
