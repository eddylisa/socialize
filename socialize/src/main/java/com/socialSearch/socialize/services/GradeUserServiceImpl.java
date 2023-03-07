package com.socialSearch.socialize.services;

import com.socialSearch.socialize.entity.GradeUser;
import com.socialSearch.socialize.repositoty.GradeUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GradeUserServiceImpl implements GradeUserService{
    @Autowired
    private GradeUserRepository gradeUserRepository;
    @Override
    public GradeUser creatGradeUser(GradeUser gradeUser) {
        return gradeUserRepository.save(gradeUser);
    }
}
