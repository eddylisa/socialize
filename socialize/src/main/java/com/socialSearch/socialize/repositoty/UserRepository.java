package com.socialSearch.socialize.repositoty;

import com.socialSearch.socialize.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    //public User findByFirstNameIgnoreCase(String name);
    public User findDistinctByFirstNameIgnoreCase(String name);

}
