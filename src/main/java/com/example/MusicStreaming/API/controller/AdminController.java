package com.example.MusicStreaming.API.controller;

import com.example.MusicStreaming.API.models.Admin;
import com.example.MusicStreaming.API.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/add")
    public String addAdmin(@RequestBody Admin admin){
        return adminService.addAdmin(admin);
    }
    @GetMapping("/fetchList")
    public List<Admin> getAllAdmins(){
        return adminService.getAllAdmins();
    }
    @DeleteMapping("/remove/{email}")
    public String deleteByEmail(@PathVariable String email) {
        return adminService.deleteByEmail(email);
    }

}
