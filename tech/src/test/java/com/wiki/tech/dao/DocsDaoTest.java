package com.wiki.tech.dao;

import com.wiki.tech.dto.DocsDto;
import com.wiki.tech.mapper.DocsMapper;
import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.test.context.junit4.SpringRunner;


@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class DocsDaoTest {
    @Autowired
    private DocsMapper docsMapper;

    @Test
    public void save(){
        DocsDto.AddRequest addRequest = new DocsDto.AddRequest();
        addRequest.setTitle("test");
        addRequest.setContent("content");
        addRequest.setAuthor_index(7);
        int docs_index = docsMapper.insertDocs(addRequest);
    }

}
