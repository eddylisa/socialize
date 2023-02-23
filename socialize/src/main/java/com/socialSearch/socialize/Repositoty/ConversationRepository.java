package com.socialSearch.socialize.Repositoty;

import com.socialSearch.socialize.Model.Conversation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConversationRepository extends JpaRepository<Conversation,Long> {
}
