package com.makotojava.learn.hellospringboot.service;

import com.makotojava.learn.hellospringboot.dto.UserDto;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @create by yanlong
 * @data 2020.09.15 23:41
 * */
public interface WebTestUserService{
    public String login(@RequestBody UserDto userDto);
}
