package com.opencode.alumxbackend.groupchatmessages.repository;

import com.opencode.alumxbackend.groupchatmessages.model.GroupMessage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GroupMessageRepository extends JpaRepository<GroupMessage, Long> {
    List<GroupMessage> findByGroupIdOrderByCreatedAtAsc(Long groupId);
}
