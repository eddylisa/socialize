package com.socialSearch.socialize.services;

import com.socialSearch.socialize.entity.Participant;
import com.socialSearch.socialize.repositoty.ParticipantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParticipantServiceImpl implements ParticipantService{
    @Autowired
    private ParticipantRepository participantRepository;
    @Override
    public Participant createParticipant(Participant participant) {
        return participantRepository.save(participant);
    }
}
