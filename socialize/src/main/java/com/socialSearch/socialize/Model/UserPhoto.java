package com.socialSearch.socialize.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class UserPhoto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "photo_id")
    private Long id;
    @Column(name = "link")
    private String link;
    @Column(name = "photo_details")
    private String details;
    @Column(name = "active")
    private boolean active;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;



}
