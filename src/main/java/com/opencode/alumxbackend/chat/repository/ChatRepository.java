package com.opencode.alumxbackend.chat.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.opencode.alumxbackend.chat.model.Chat;

@Repository
public interface ChatRepository extends JpaRepository<Chat, Long> {
    
    Optional<Chat> findByUser1IdAndUser2Id(
            Long user1Id,
            Long user2Id
    );
}
