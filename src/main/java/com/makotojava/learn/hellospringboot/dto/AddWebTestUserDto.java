package com.makotojava.learn.hellospringboot.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;
@Data
@ApiModel(value = "用户注册类",description = "用户注册类请求参数")
public class AddWebTestUserDto {


    /**
     * 用户名
     */
    @ApiModelProperty(value="用户名",example = "admin",required = true)
    private String userName;

    /**
     * 密码
     */
    @ApiModelProperty(value="用户名",example = "admin",required = true)
    private String password;

    /**
     * 邮箱
     */
    @ApiModelProperty(value="用户名",example = "admin",required = true)
    private String email;

    /**
     * 自动生成用例job名称 不为空时表示已经创建
     */
    @ApiModelProperty(value="用户名",example = "admin",required = true)
    private String autoCreateCaseJobName;

    /**
     * 执行测试job名称 不为空时表示已经创建
     */
    @ApiModelProperty(value="用户名",example = "admin",required = true)
    private String startTestJobName;
    /**
     * 默认jenkins服务器
     */
    @ApiModelProperty(value="用户名",example = "admin",required = true)
    private Integer defaultJenkinsId;

    /**
     * 创建时间
     */
    @ApiModelProperty(value="用户名",example = "admin",required = true)
    private Date createTime;

    /**
     * 更新时间
     */
    @ApiModelProperty(value="用户名",example = "admin",required = true)
    private Date updateTime;


}
