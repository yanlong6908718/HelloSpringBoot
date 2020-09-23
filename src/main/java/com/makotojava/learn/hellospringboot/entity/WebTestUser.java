package com.makotojava.learn.hellospringboot.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "web_test_user")
public class WebTestUser extends BaseEntityNew {
    /**
     * 主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 自动生成用例job名称 不为空时表示已经创建
     */
    @Column(name = "auto_create_case_job_name")
    private String autoCreateCaseJobName;

    /**
     * 执行测试job名称 不为空时表示已经创建
     */
    @Column(name = "start_test_job_name")
    private String startTestJobName;

    /**
     * 默认jenkins服务器
     */
    @Column(name = "default_jenkins_id")
    private Integer defaultJenkinsId;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户名
     *
     * @return user_name - 用户名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户名
     *
     * @param userName 用户名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取自动生成用例job名称 不为空时表示已经创建
     *
     * @return auto_create_case_job_name - 自动生成用例job名称 不为空时表示已经创建
     */
    public String getAutoCreateCaseJobName() {
        return autoCreateCaseJobName;
    }

    /**
     * 设置自动生成用例job名称 不为空时表示已经创建
     *
     * @param autoCreateCaseJobName 自动生成用例job名称 不为空时表示已经创建
     */
    public void setAutoCreateCaseJobName(String autoCreateCaseJobName) {
        this.autoCreateCaseJobName = autoCreateCaseJobName;
    }

    /**
     * 获取执行测试job名称 不为空时表示已经创建
     *
     * @return start_test_job_name - 执行测试job名称 不为空时表示已经创建
     */
    public String getStartTestJobName() {
        return startTestJobName;
    }

    /**
     * 设置执行测试job名称 不为空时表示已经创建
     *
     * @param startTestJobName 执行测试job名称 不为空时表示已经创建
     */
    public void setStartTestJobName(String startTestJobName) {
        this.startTestJobName = startTestJobName;
    }

    /**
     * 获取默认jenkins服务器
     *
     * @return default_jenkins_id - 默认jenkins服务器
     */
    public Integer getDefaultJenkinsId() {
        return defaultJenkinsId;
    }

    /**
     * 设置默认jenkins服务器
     *
     * @param defaultJenkinsId 默认jenkins服务器
     */
    public void setDefaultJenkinsId(Integer defaultJenkinsId) {
        this.defaultJenkinsId = defaultJenkinsId;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}