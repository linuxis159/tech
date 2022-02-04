package com.wiki.tech.mapper;

import com.wiki.tech.dto.UserDto;
import com.wiki.tech.vo.Author;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.Optional;

@Mapper
public interface AuthorMapper {
    @Select("SELECT * FROM AUTHOR WHERE author_index=${id}")
    Optional<Author> findByUserIdx(long id);
    @Insert("INSERT INTO author (AUTHOR_INDEX,ID,PASS,EMAIL) VALUES(AUTHOR_INDEX_SEQ.nextval,#{id},#{password},#{email})")
    void save(UserDto.JoinRequest joinRequest);

}
