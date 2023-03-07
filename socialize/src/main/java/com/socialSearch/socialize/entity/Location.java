package com.socialSearch.socialize.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "location")
@Data
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double latitude;
    private double longitude;
    private double distance;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
