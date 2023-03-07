package com.socialSearch.socialize.Controller;

import com.socialSearch.socialize.entity.GradeUser;
import com.socialSearch.socialize.repositoty.GradeUserRepository;
import com.socialSearch.socialize.services.GradeUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/grading/")
public class GradeUserController {
    @Autowired
    private GradeUserService gradeUserService;
    @PostMapping("register")
    public String recordGradeUser(@RequestBody GradeUser gradeUser){
        gradeUserService.creatGradeUser(gradeUser);
        return "User grade recorded successfully";
    }
}
