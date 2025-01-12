package com.group07.mapper;

import com.group07.entity.Admin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMapper {
    List<Admin> getAllAdmins();

    Admin getAdminById(Integer adminId);

    int addAdmin(Admin admin);

    int editAdmin(Admin admin);

    boolean deleteAdmin(Integer adminId);
}