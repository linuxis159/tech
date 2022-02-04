package com.wiki.tech.dao;

import com.wiki.tech.dto.UserDto;
import com.wiki.tech.mapper.AuthorMapper;
import com.wiki.tech.vo.Author;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.junit4.SpringRunner;



@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@MybatisTest
public class AuthorDaoTest {
    @Autowired
    private AuthorMapper authorMapper;



    @Test
    void addAuthor(){
        UserDto.JoinRequest joinRequest = new UserDto.JoinRequest();
        joinRequest.setId("test");
        joinRequest.setEmail("dlrrud159@naver.com");
        joinRequest.setPassword("1597");
        authorMapper.save(joinRequest);
    }

    @Test
    public void getAuthor(){
        Author author = authorMapper.findByUserIdx(7)
                .orElseThrow(() -> new NullPointerException());
    }
}
