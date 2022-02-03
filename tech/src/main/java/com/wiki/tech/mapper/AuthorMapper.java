package com.wiki.tech.mapper;

import com.wiki.tech.dto.UserDto;
import com.wiki.tech.vo.Author;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AuthorMapper {
    @Insert("INSERT INTO author (AUTHOR_INDEX,ID,PASS,EMAIL) VALUES(AUTHOR_INDEX_SEQ.nextval,#{id},#{password},#{email})")
    void insertAuthor(UserDto.JoinRequest joinRequest);

}
