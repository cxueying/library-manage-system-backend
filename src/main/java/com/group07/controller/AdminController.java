package com.group07.controller;

import com.group07.entity.Admin;
import com.group07.service.IAdminService;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {
    @Resource
    private IAdminService adminService;

    @GetMapping("/all")
    public List<Admin> getAllAdmins() {
        return adminService.getAllAdmins();
    }

    @GetMapping("/by-id/{adminId}")
    public Admin getAdminById(@PathVariable("adminId") Integer adminId) {
        Admin admin = adminService.getAdminById(adminId);
        Assert.notNull(admin, "所查管理员不存在");
        return admin;
    }

    @PostMapping("/add")
    public int addAdmin(@RequestBody Admin admin) {
        return adminService.addAdmin(admin);
    }

    @PutMapping("/edit")
    public int editAdmin(@RequestBody Admin admin) {
        return adminService.editAdmin(admin);
    }

    @GetMapping("/delete/{adminId}")
    public boolean deleteAdmin(@PathVariable("adminId") Integer adminId) {
        return adminService.deleteAdmin(adminId);
    }
}