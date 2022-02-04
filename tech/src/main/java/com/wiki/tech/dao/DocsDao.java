package com.wiki.tech.dao;

import com.wiki.tech.dto.DocsDto;
import com.wiki.tech.mapper.DocsMapper;
import com.wiki.tech.vo.Docs;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@RequiredArgsConstructor
public class DocsDao {
    private final DocsMapper docsMapper;


    public int save(DocsDto.AddRequest addRequest){
        int docs_index = docsMapper.insertDocs(addRequest);
        return docs_index;
    }
}
