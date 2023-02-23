package com.socialSearch.socialize.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class GradeUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;
//    private  User userAccGivenGrade;
//    private User userAccReceivedGrade;
    private int grade;
}
