package com.socialSearch.socialize.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
@Entity
@Data
@Table(name = "user_acc")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "f_name")
    private String firstName;
    @Column(name = "l_name")
    private String lastName;
    @Column(name = "phone")
    private String phoneNumber;
    @Enumerated(EnumType.STRING)
    @Column(name = "gender")
    private EnumGender gender;
    @Column(name = "details")
    private String detail;
    @Column(name = "email")
    private String email;
//    @Temporal(TemporalType.DATE)
//    @DateTimeFormat(style = "hh:mm")
    @JsonDeserialize(using = DateDeserializers.TimestampDeserializer.class)
    @Column(name = "confirmedAt")
    private LocalDateTime confirmationTime;
    @Column(name = "popularity")
    private Double popularity;
    @Column(name = "dob")
    private LocalDateTime dateOfBirth;
    @Column(name = "religion")
    private String religion;
    @Enumerated(EnumType.STRING)
    @Column(name = "interested_relationship")
    private EnumGender interested_in_relationship;
    @Enumerated(EnumType.STRING)
    @Column(name = "relationship_type")
    private EnumRelationshipType relationshipType;
    @Enumerated(EnumType.STRING)
    @Column(name = "interested_Gender")
    private EnumInterestedInGender interestedGender;
    @ManyToMany
    @JoinTable(name = "blocked_users", joinColumns = {@JoinColumn(name = "user_id")}, inverseJoinColumns = {@JoinColumn(name = "blocked_user_id")})
    @JsonIgnore

    private List<BlockUser> blockedUsers;
    @JsonIgnore
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Conversation> conversations;
    @JsonIgnore
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Participant> participants;
    @JsonIgnore
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<UserPhoto> photos;
    @JsonIgnore
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Location> Locations;
    @JsonIgnore
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<GradeUser> gradeUsers;

//    public void setConfirmedAt(LocalDateTime confirmedAt) {
//        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd MMMM , YYYY");
//        df.format(confirmedAt);
//        this.confirmedAt = confirmedAt;
//    }!
}
