package com.socialSearch.socialize.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;



    @Entity
    @Data
    public class Message {
        @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "message_id")
    private long id;
        @Column(name = "message_text")
    private String text;
    @Column(name = "confirmation_date",columnDefinition = "TIME")
    private LocalDateTime sentAt;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "participantId")
    private Participant participant;
}
