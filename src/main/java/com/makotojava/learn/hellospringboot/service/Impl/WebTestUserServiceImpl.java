package com.makotojava.learn.hellospringboot.service.Impl;
import com.makotojava.learn.hellospringboot.common.ResultDto;
import com.makotojava.learn.hellospringboot.dao.WebTestUserMapper;
import com.makotojava.learn.hellospringboot.dto.UserDto;
import com.makotojava.learn.hellospringboot.entity.WebTestUser;
import com.makotojava.learn.hellospringboot.service.WebTestUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @create by yanlong
 * @data 2020.09.15 23:41
 * */
@Service
public class WebTestUserServiceImpl implements WebTestUserService{

    @Autowired
    private WebTestUserMapper webTestUserMapper;

    @Override
    public String login(UserDto userDto){
        System.out.println("user:"+userDto.getName());
        System.out.println("password:"+userDto.getPassword());
        return userDto.getName()+"&"+userDto.getPassword();
    }

    @Override
    public ResultDto<WebTestUser> save(WebTestUser webTestUser){
        webTestUser.setCreateTime(new Date());
        webTestUser.setUpdateTime(new Date());
        webTestUserMapper.insertUseGeneratedKeys(webTestUser);
        return ResultDto.success("success",webTestUser);
    }

}
