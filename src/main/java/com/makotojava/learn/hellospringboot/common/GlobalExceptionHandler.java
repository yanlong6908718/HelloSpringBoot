package com.makotojava.learn.hellospringboot.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@Slf4j
@ResponseBody
@ControllerAdvice
public class GlobalExceptionHandler {
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({ServiceException.class})
    public String serviceExceptionHandler(ServiceException se){

        return resultFormat(se);
    }

    @ResponseStatus(HttpStatus.BAD_GATEWAY)
    @ExceptionHandler({Exception.class})
    public String exceptionHandler(Exception e){

        return resultFormat(e);
    }

    @ExceptionHandler({Throwable.class})
    public String throwableHandler(Throwable t){
        log.error(t.getMessage());
        return "系统错误";
    }


    public String resultFormat(Throwable t){
        String tips="系统繁忙，请稍后重试";
        if(t instanceof ServiceException){
            log.error(t.getMessage());
            return "业务异常 "+tips;
        }
        if(t instanceof Exception){
            log.error(t.getMessage());
            return "系统异常 "+tips;
        }
        return tips;
    }


}
