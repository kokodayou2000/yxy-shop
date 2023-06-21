package com.example.web.controller.dao;

import com.example.entity.Admin;
import com.example.service.IAdminService;
import org.apache.commons.codec.digest.Md5Crypt;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.nio.charset.StandardCharsets;
import java.util.List;


@RestController
@RequestMapping("/admin")
public class AdminController {
    @Resource
    private IAdminService adminService;

    @GetMapping("/all")
    public List<Admin> getAll(){
        List<Admin> allAdmin = adminService.getAllAdmin();
        System.out.println(allAdmin);
        return allAdmin;
    }
    @GetMapping("/insert")
    public String insertAdmin(){
        Admin admin = new Admin();
        admin.setEmail("110");
        admin.setNickName("nick");
        admin.setCreateBy("meme");
        admin.setPwd(Md5Crypt.md5Crypt("123".getBytes(StandardCharsets.UTF_8)));
        adminService.save(admin);
        return admin+admin.getCreateBy();
    }
}
