package com.socialSearch.socialize.Repositoty;

import com.socialSearch.socialize.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
//    User findByNameIgnoreCase(String name);
}
