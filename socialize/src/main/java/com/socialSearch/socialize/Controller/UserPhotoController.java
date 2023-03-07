package com.socialSearch.socialize.Controller;

import com.socialSearch.socialize.entity.Participant;
import com.socialSearch.socialize.entity.UserPhoto;
import com.socialSearch.socialize.services.ParticipantService;
import com.socialSearch.socialize.services.UserPhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api/user_photos/")
public class UserPhotoController{

        private UserPhotoService userPhotoService;
        @PostMapping("register")
        public String recordUserPhoto(@RequestBody UserPhoto userPhoto){
            userPhotoService.createUserPhoto(userPhoto);
            return "userPhoto recorded successfully";
        }
}
