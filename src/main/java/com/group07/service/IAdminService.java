package com.group07.service;

import com.group07.entity.Admin;

import java.util.List;

public interface IAdminService {
    List<Admin> getAllAdmins();

    Admin getAdminById(Integer adminId);

    int addAdmin(Admin admin);

    int editAdmin(Admin admin);

    boolean deleteAdmin(Integer adminId);
}