package com.wiki.tech.dao;

import com.wiki.tech.dto.UserDto;
import com.wiki.tech.mapper.AuthorMapper;
import com.wiki.tech.vo.Author;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
@RequiredArgsConstructor
public class AuthorDao {
    private final AuthorMapper authorMapper;

    public void save(UserDto.JoinRequest joinRequest){
        authorMapper.save(joinRequest);
    }

    public void findByUserIdx(int id){
        Author author = authorMapper.findByUserIdx(id)
                .orElseThrow(() -> new NullPointerException());

    }
}
