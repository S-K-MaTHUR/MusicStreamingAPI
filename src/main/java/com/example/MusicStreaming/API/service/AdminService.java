package com.example.MusicStreaming.API.service;

import com.example.MusicStreaming.API.models.Admin;
import com.example.MusicStreaming.API.repo.IAdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AdminService {

    @Autowired
    IAdminRepo iAdminRepo;

    public String addAdmin(Admin admin) {
        return null;
    }

    public List<Admin> getAllAdmins() {
        return null;
    }

    public String deleteByEmail(String email) {
        return email;
    }
}
