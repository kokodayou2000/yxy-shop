package com.example.entity;

import com.example.common.entry.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Admin extends BaseEntity {
    private static final long serialVersionUID = 1L;

    private long userId;


    private String roleName;

    private String nickName;

    private String email;

    private String pwd;

    private Date lastLogin;


}
