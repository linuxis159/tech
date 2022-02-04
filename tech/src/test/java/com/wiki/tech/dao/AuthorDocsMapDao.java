package com.wiki.tech.dao;

import com.wiki.tech.mapper.AuthorDocsMapMapper;
import lombok.RequiredArgsConstructor;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class AuthorDocsMapDao {
    @Autowired
    private AuthorDocsMapMapper authorDocsMapMapper;


}
