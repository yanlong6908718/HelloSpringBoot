package com.makotojava.learn.hellospringboot.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * @create by yanlong
 * @data 2020.09.14 22:13
 * */
@ApiModel(value = "用户登陆参数",description = "请求参数类")
public class UserDto {

    @ApiModelProperty(value="用户名",example = "admin",required = true)
    private String name;
    @ApiModelProperty(value="用户密码",example = "admin",required = true)
    private String password;

    public String getName() {
        return this.name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }


//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }




}
