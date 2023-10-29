package com.example.MusicStreaming.API.repo;

import com.example.MusicStreaming.API.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAdminRepo extends JpaRepository<Admin, Long> {

    Admin findByAdminEmail(String userAdminEmail);
}
