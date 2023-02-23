package com.socialSearch.socialize.Repositoty;

import com.socialSearch.socialize.Model.BlockUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlockUserRepository extends JpaRepository<BlockUser,Long> {
}
