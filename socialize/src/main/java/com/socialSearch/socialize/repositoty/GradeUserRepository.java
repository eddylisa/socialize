package com.socialSearch.socialize.repositoty;

import com.socialSearch.socialize.entity.GradeUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GradeUserRepository extends JpaRepository<GradeUser, Long> {
}
