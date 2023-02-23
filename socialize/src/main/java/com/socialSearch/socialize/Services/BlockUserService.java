package com.socialSearch.socialize.Services;

import com.socialSearch.socialize.Model.BlockUser;
import com.socialSearch.socialize.Repositoty.BlockUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface BlockUserService {
  void createBlockUserAccount(BlockUser blockUser);
}
