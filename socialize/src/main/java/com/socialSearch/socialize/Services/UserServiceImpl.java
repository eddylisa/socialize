package com.socialSearch.socialize.Services;

import com.socialSearch.socialize.Model.User;
import com.socialSearch.socialize.Repositoty.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Override
    public User createUserAccount(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> viewUsers() {
        List<User> users = userRepository.findAll();
        return users;
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.delete(userRepository.findById(id).get());
    }

//    @Override
//    public User updateUser(User user) {
//
//        return userRepository.save(user);
//    }

}
