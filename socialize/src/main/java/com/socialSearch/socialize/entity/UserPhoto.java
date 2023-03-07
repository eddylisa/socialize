package com.socialSearch.socialize.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class UserPhoto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "link")
    private String link;
    @Column(name = "details")
    private String details;
    @Column(name = "active")
    private boolean active;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;



}
