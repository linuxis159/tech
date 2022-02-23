package com.wiki.tech.dao;

import com.wiki.tech.dto.DocsDto;
import com.wiki.tech.mapper.DocsMapper;
import com.wiki.tech.vo.Docs;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class DocsDao {
    private final DocsMapper docsMapper;

    public Docs findByTitle(DocsDto.SearchRequest searchRequest){
        Docs docs = docsMapper.findByTitle(searchRequest)
                .orElseGet(() -> new Docs());
        return docs;
    }
    public int save(DocsDto.AddRequest addRequest){
        int docs_index = docsMapper.insertDocs(addRequest);
        return docs_index;
    }
}
