package com.makotojava.learn.hellospringboot.common;

import org.slf4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class DemoInterceptor implements HandlerInterceptor {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(DemoInterceptor.class);

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


