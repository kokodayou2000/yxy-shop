package com.example.framework.interceptor;

import com.example.common.annotation.RepeatSubmit;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.lang.reflect.Method;

public abstract class RepeatSubmitInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        //前端向后端发送的请求，只对方法进行监控
        if (handler instanceof HandlerMethod){
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            Method method = handlerMethod.getMethod();
            RepeatSubmit annotation = method.getAnnotation(RepeatSubmit.class);
            if (annotation != null){
                //判断是否是重复提交，通过redis
                if (this.isRepeatSubmit(request,annotation)){



                }
            }



        }


        return HandlerInterceptor.super.preHandle(request, response, handler);
    }

    public abstract boolean isRepeatSubmit(HttpServletRequest request,RepeatSubmit repeatSubmit);
}
