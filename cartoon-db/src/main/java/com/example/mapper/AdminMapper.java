package com.example.mapper;


import com.example.entity.Admin;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdminMapper {
    public List<Admin> getAllAdmin();

    int save(Admin admin);
}
