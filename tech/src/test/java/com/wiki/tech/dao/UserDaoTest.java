package com.wiki.tech.dao;

import com.wiki.tech.dto.UserDto;
import com.wiki.tech.mapper.AuthorMapper;
import com.wiki.tech.vo.Author;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;


@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@MybatisTest
public class UserDaoTest {
    @Autowired
    AuthorMapper authorMapper;

    @Test
    void insertAuthor(){
        UserDto.JoinRequest joinRequest = new UserDto.JoinRequest();
        joinRequest.setId("test");
        joinRequest.setEmail("dlrrud159@naver.com");
        joinRequest.setPassword("1597");
        authorMapper.insertAuthor(joinRequest);
    }
}
