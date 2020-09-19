package com.makotojava.learn.hellospringboot.common;

import jdk.nashorn.internal.ir.RuntimeNode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
@Slf4j
public class DemoInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse var2, Object var3) throws Exception{
        log.info("===perHamdle===");
        log.info("===request.getRequestURI()==="+ request.getRequestURI());
        var2.setCharacterEncoding("UTF-8");
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse var2, Object var3, ModelAndView var4) throws Exception{
        log.info("===postHandle===");
        log.info("===request.getRequestURI()==="+ request.getRequestURI());
        var2.setCharacterEncoding("UTF-8");
    }

    public void afterCompletion(HttpServletRequest request, HttpServletResponse var2, Object var3, Exception var4) throws Exception{
        log.info("===afterCompletion===");
        log.info("===request.getRequestURI()==="+ request.getRequestURI());
        var2.setCharacterEncoding("UTF-8");
    }
}


