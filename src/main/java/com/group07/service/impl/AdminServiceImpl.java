package com.group07.service.impl;

import com.group07.entity.Admin;
import com.group07.mapper.AdminMapper;
import com.group07.service.IAdminService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminServiceImpl implements IAdminService {
    @Resource
    private AdminMapper adminMapper;

    @Override
    public List<Admin> getAllAdmins() {
        return adminMapper.getAllAdmins();
    }

    @Override
    public Admin getAdminById(Integer adminId) {
        return adminMapper.getAdminById(adminId);
    }

    @Override
    public int addAdmin(Admin admin) {
        return adminMapper.addAdmin(admin);
    }

    @Override
    public int editAdmin(Admin admin) {
        return adminMapper.editAdmin(admin);
    }

    @Override
    public boolean deleteAdmin(Integer adminId) {
        return adminMapper.deleteAdmin(adminId);
    }
}