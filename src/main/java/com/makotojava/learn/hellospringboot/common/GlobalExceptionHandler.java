package com.makotojava.learn.hellospringboot.common;

import org.slf4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseBody
@ControllerAdvice
public class GlobalExceptionHandler {
    private static final Logger log = org.slf4j.LoggerFactory.getLogger(GlobalExceptionHandler.class);

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler({ServiceException.class})
    public ResultDto serviceExceptionHandler(ServiceException se){

        return resultFormat(se);
    }

    @ResponseStatus(HttpStatus.BAD_GATEWAY)
    @ExceptionHandler({Exception.class})
    public ResultDto exceptionHandler(Exception e){

        return resultFormat(e);
    }

    @ExceptionHandler({Throwable.class})
    public ResultDto throwableHandler(Throwable t){
        log.error(t.getMessage());
        return ResultDto.fail("系统错误");
    }


    public ResultDto resultFormat(Throwable t){
        String tips="系统繁忙，请稍后重试";
        if(t instanceof ServiceException){
            log.error(t.getMessage());
            return ResultDto.fail("业务异常 "+tips);
        }
        if(t instanceof Exception){
            log.error(t.getMessage());
            return ResultDto.fail("系统异常 "+tips);
        }
        return ResultDto.fail(tips);
    }


}
