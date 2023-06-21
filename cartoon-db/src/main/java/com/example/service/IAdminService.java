package com.example.service;


import com.example.entity.Admin;

import java.util.List;

public interface IAdminService {
    public List<Admin> getAllAdmin();

    public int save(Admin admin);
}
