package com.socialSearch.socialize.services;

import com.socialSearch.socialize.entity.User;
import com.socialSearch.socialize.repositoty.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

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
    public User findUserById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
    public void updateUser(Long id, User user){
    User u = this.findUserById(id);
        if(Objects.nonNull(user.getFirstName()) && !"".equalsIgnoreCase(user.getFirstName())){
            u.setFirstName(user.getFirstName());
        }
    userRepository.save(user);
    }

    @Override
    public User findUserByName(String name) {
        return userRepository.findDistinctByFirstNameIgnoreCase(name);
    }

}
