package com.makotojava.learn.hellospringboot.controller;

import com.makotojava.learn.hellospringboot.common.ResultDto;
import com.makotojava.learn.hellospringboot.common.ServiceException;
import com.makotojava.learn.hellospringboot.dto.UserDto;
import com.makotojava.learn.hellospringboot.service.WebTestUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @create by yanlong
 * @data 2020.09.14 22:03
 * */

@RestController
@Api(tags = "用户管理")
@RequestMapping("user")
@Slf4j
public class WebUserController {
    @Autowired
    private WebTestUserService webTestUserService;
    @Value("${info.key1}")
    private String userinfo1;


    @PostMapping(value="login")
    @ApiOperation("登陆")
    public ResultDto<UserDto> login(@RequestBody UserDto userDto){
        String result = webTestUserService.login(userDto);

            if (userDto.getName().contains("error")){
                ServiceException.throwEx("用户名中错误");
            }
            if (userDto.getName().contains("EEEE2")){
                throw new NullPointerException();
            }


        return ResultDto.success("success,成功"+userinfo1);
    }

    @GetMapping(value="byid/{userid}/{id}")
    @ApiOperation("getdemo")
    public String login(@PathVariable("userid") Long userid,@PathVariable("id") String id){

        System.out.println("user:"+userid+id);

        return "success"+userid+id;
    }
//    @RequestMapping(value="byid",method = RequestMethod.GET)
    @GetMapping(value="byid")
    public String login2(@RequestParam(value="byid" ,required = true) Long userid,@RequestParam("id") String id){

        System.out.println("user:"+userid+id);

        return "success"+userid+id;
    }
}

