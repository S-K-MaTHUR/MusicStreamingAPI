package com.example.MusicStreaming.API.repo;

import com.example.MusicStreaming.API.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepo extends JpaRepository<User,Long> {

    User findByUserEmail(String userEmail);
}
