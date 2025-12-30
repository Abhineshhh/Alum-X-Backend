package com.opencode.alumxbackend.chat.service;

import com.opencode.alumxbackend.chat.dto.ChatSendResponse;

public interface ChatService {
    ChatSendResponse createMessage(Long senderId, Long recieverId, String content);
}
