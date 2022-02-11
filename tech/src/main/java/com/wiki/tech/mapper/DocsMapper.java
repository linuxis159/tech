package com.wiki.tech.mapper;

import com.wiki.tech.dto.DocsDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import java.util.Optional;

@Mapper
public interface DocsMapper {

    @Select("SELECT title,content,createdDate FROM docs where title=#{title}")
    DocsDto.ResponseDocs findByTitle(DocsDto.SearchRequest searchRequest);

    @Insert("INSERT INTO docs (docs_index, title, content) VALUES(docs_index_seq.nextval, #{title}, #{content})")
    @SelectKey(statement = {"SELECT MAX(DOCS_INDEX) FROM DOCS"}, keyProperty = "docs_index", before = false, resultType = int.class)
    int insertDocs(DocsDto.AddRequest addRequest);


}
