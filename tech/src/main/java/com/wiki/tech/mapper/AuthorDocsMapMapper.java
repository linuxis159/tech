package com.wiki.tech.mapper;

import com.wiki.tech.dto.DocsDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthorDocsMapMapper {
    @Insert("INSERT INTO author_docs_map VALUES(${author_index}, ${docs_index})")
    void save(DocsDto.AddRequest addRequest);


}
