package com.wiki.tech.dao;

import com.wiki.tech.dto.DocsDto;
import com.wiki.tech.mapper.AuthorDocsMapMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class AuthorDocsMapDao {
    private final AuthorDocsMapMapper authorDocsMapMapper;

    public void save(DocsDto.AddRequest addRequest){
        authorDocsMapMapper.save(addRequest);

    }
}
