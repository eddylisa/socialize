package com.socialSearch.socialize.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlockUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
//    private String blockerAccount;
//    private User blockedAccount;
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "userId")
//    @ManyToMany(cascade = {CascadeType.ALL})
//    private User user;
@ManyToMany(mappedBy = "blockedUsers",cascade = CascadeType.ALL)
    private List<User> users;



}
