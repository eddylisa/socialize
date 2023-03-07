package com.socialSearch.socialize.Controller;

import com.socialSearch.socialize.entity.Participant;
import com.socialSearch.socialize.services.ParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/participants/")
public class ParticipantController {
    @Autowired
    private ParticipantService participantService;
    @PostMapping("register")
    public String recordParticipant(@RequestBody Participant participant){
        participantService.createParticipant(participant);
        return "participant recorded successfully";
    }
}
