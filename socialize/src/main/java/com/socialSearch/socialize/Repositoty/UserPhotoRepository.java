package com.socialSearch.socialize.Repositoty;

import com.socialSearch.socialize.Model.Conversation;
import com.socialSearch.socialize.Model.UserPhoto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPhotoRepository extends JpaRepository<UserPhoto, Long> {
}
