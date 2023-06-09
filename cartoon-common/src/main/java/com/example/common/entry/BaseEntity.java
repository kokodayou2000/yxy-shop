package com.example.common.entry;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

@Data
public class BaseEntity implements Serializable {
    private static final long serialVersionUID = 1l;



    /**创建时间*/
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm::ss")
    private Date createTime;
    /**创建者*/
    private String createBy;

    /**备注*/
    private String remark;




    /**请求参数*/
//    private Map<String,Object> params;

}
