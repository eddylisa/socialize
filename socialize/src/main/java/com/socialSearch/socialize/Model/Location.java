package com.socialSearch.socialize.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "user_location")
@Data
public class Location {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private long latitude;
    private long longitude;
    private double distance;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private User user;
}
