package com.socialSearch.socialize.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.socialSearch.socialize.entity.EnumGender;
import com.socialSearch.socialize.entity.EnumInterestedInGender;
import com.socialSearch.socialize.entity.EnumRelationshipType;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserModel {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String matchPassword;
    private String role;
}
