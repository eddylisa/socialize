package com.socialSearch.socialize.services;

import com.socialSearch.socialize.entity.User;

import java.util.List;


public interface UserService {

   public User createUserAccount(User user);

   public List<User> viewUsers();

   public void deleteUser(Long id);


  public User findUserById(Long id);

    public void updateUser(Long id, User user);

     public User findUserByName(String name);
}
