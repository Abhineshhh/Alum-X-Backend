package com.opencode.alumxbackend.users.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.opencode.alumxbackend.users.dto.UserRequest;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testCreateUser() throws Exception {
        // Create a UserRequest object
        UserRequest userRequest = UserRequest.builder()
                .username("testuser")
                .name("Test User")
                .email("test@example.com")
                .password("password123")
                .role("STUDENT")
                .build();

        // Convert to JSON
        String userJson = objectMapper.writeValueAsString(userRequest);

        // Perform POST request
        mockMvc.perform(post("/api/users")
                .contentType(MediaType.APPLICATION_JSON)
                .content(userJson))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.message").value("User created successfully via DEV API"))
                .andExpect(jsonPath("$.userId").exists())
                .andExpect(jsonPath("$.role").value("STUDENT"));
    }
}