package com.socialSearch.socialize.Repositoty;

import com.socialSearch.socialize.Model.Conversation;
import com.socialSearch.socialize.Model.Participant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParticipantRepository extends JpaRepository<Participant, Long> {
}
