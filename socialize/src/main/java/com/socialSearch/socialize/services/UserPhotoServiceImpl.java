package com.socialSearch.socialize.services;

import com.socialSearch.socialize.entity.UserPhoto;
import com.socialSearch.socialize.repositoty.UserPhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserPhotoServiceImpl implements  UserPhotoService{
    @Autowired
    private UserPhotoRepository userPhotoRepository;
    @Override
    public UserPhoto createUserPhoto(UserPhoto userPhoto) {
       return userPhotoRepository.save(userPhoto);
    }
}
