package com.example.service.impl;

import com.example.entity.Admin;
import com.example.mapper.AdminMapper;
import com.example.service.IAdminService;
import org.apache.commons.codec.digest.Md5Crypt;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.nio.charset.StandardCharsets;
import java.util.List;

@Service
public class AdminServiceImpl implements IAdminService {

    @Resource
    private AdminMapper adminMapper;
    @Override
    public List<Admin> getAllAdmin() {

        return adminMapper.getAllAdmin();
    }

    @Override
    public int save(Admin admin) {

        admin.setPwd(Md5Crypt.md5Crypt(admin.getPwd().getBytes(StandardCharsets.UTF_8)));
        return adminMapper.save(admin);
    }
}
