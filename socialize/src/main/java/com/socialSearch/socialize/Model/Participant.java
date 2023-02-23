package com.socialSearch.socialize.Model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Entity
    @Data
    public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "participant_id")
    private Long id;
    @Column(name = "joined_at",columnDefinition = "TIME")
    private LocalDateTime joinedAt;
    @Column(name = "left_at",columnDefinition = "TIME")
    private LocalDateTime leftAt;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "conversationId")
    private Conversation conversation;
    @JsonIgnore
    @OneToMany(mappedBy = "participant",cascade = CascadeType.ALL)
    private List<Message> messages;
}

