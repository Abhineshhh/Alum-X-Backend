# Alum-X Backend Database Schema

## Overview

This document provides a complete database diagram for the Alum-X Backend project.

## Database Diagram

**DBDiagram.io Link:** https://dbdiagram.io/d/db-diagram-6953811139fa3db27bcad4bf

## Schema Summary

- Main Entity Tables: 10
- Collection Tables: 13
- Total Tables: 23

## Core Entity Tables

| Table | Primary Key | Description |
|-------|-------------|-------------|
| users | id | User accounts and profiles |
| resume | id | User resume storage |
| job_posts | post_id | Job/opportunity posts |
| job_post_comments | id | Comments on job posts |
| job_post_likes | id | Likes on job posts |
| chats | chat_id | Direct message conversations |
| messages | id | Chat messages |
| group_chats | group_id | Group conversations |
| group_chat_participants | id | Group members |
| group_messages | id | Group chat messages |

## User Collection Tables

| Table | Foreign Key |
|-------|-------------|
| user_skills | user_id |
| user_education | user_id |
| user_tech_stack | user_id |
| user_languages | user_id |
| user_frameworks | user_id |
| user_communication_skills | user_id |
| user_certifications | user_id |
| user_projects | user_id |
| user_soft_skills | user_id |
| user_hobbies | user_id |
| user_experience | user_id |
| user_internships | user_id |
| job_post_images | post_id |

## Relationships

### One-to-One
- users - resume

### One-to-Many
- users -> job_post_comments
- users -> job_post_likes
- job_posts -> job_post_images
- job_posts -> job_post_comments
- job_posts -> job_post_likes
- chats -> messages
- group_chats -> group_chat_participants
- group_chats -> group_messages

---
Issue #125: Database Diagram for the Project
