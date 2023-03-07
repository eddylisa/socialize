package com.socialSearch.socialize.repositoty;

import com.socialSearch.socialize.entity.BlockUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockUserRepository extends JpaRepository<BlockUser,Long> {
}
