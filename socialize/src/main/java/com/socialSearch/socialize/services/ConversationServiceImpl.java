package com.socialSearch.socialize.services;

import com.socialSearch.socialize.entity.Conversation;
import com.socialSearch.socialize.repositoty.ConversationRepository;
import org.hibernate.engine.spi.SessionDelegatorBaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

@Service
public class ConversationServiceImpl implements ConversationService {
    @Autowired
    private ConversationRepository conversationRepository;
    @Override
    public Conversation saveConversation(Conversation conversation) {
        return conversationRepository.save(conversation);
    }
}
