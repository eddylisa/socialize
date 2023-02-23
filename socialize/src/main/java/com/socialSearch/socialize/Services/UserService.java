package com.socialSearch.socialize.Services;

import com.socialSearch.socialize.Model.User;
import com.socialSearch.socialize.Repositoty.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {

   public User createUserAccount(User user);

   public List<User> viewUsers();

   public void deleteUser(Long id);


}
