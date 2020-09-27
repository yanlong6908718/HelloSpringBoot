package com.makotojava.learn.hellospringboot.dao;

import com.makotojava.learn.hellospringboot.common.MySqlExtensionMapper;
import com.makotojava.learn.hellospringboot.entity.WebTestUser;
import org.springframework.stereotype.Repository;

@Repository
public interface WebTestUserMapper extends MySqlExtensionMapper<WebTestUser> {

}