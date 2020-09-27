package com.makotojava.learn.hellospringboot.service;

import com.makotojava.learn.hellospringboot.common.ResultDto;
import com.makotojava.learn.hellospringboot.dao.WebTestUserMapper;
import com.makotojava.learn.hellospringboot.dto.UserDto;
import com.makotojava.learn.hellospringboot.entity.WebTestUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @create by yanlong
 * @data 2020.09.15 23:41
 * */
public interface WebTestUserService{

    public String login(@RequestBody UserDto userDto);

    /*save
    * */
    public ResultDto<WebTestUser> save(@RequestBody WebTestUser webTestUser);
}
