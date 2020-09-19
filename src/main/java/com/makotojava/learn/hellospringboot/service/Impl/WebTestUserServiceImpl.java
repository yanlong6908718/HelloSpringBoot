package com.makotojava.learn.hellospringboot.service.Impl;
import com.makotojava.learn.hellospringboot.dto.UserDto;
import com.makotojava.learn.hellospringboot.service.WebTestUserService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @create by yanlong
 * @data 2020.09.15 23:41
 * */
@Service
public class WebTestUserServiceImpl implements WebTestUserService{
    public String login(UserDto userDto){
        System.out.println("user:"+userDto.getName());
        System.out.println("password:"+userDto.getPassword());
        return userDto.getName()+"&"+userDto.getPassword();
    }

}
