package com.example.framework.interceptor.impl;

import com.example.common.annotation.RepeatSubmit;
import com.example.framework.interceptor.RepeatSubmitInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;


@Component
public class SameUrlDataInterceptor extends RepeatSubmitInterceptor {


    public final String REPEAT_PARAMS = "repeatParams";
    public final String REPEAT_TIME = "repeatTime";


    // 令牌自定义标识
    @Value("${token.header}")
    private String header;

    /// 未实现

    @Override
    public boolean isRepeatSubmit(HttpServletRequest request, RepeatSubmit repeatSubmit) {

        return false;
    }
}
