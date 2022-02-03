package com.wiki.tech.dao;

import com.wiki.tech.dto.UserDto;
import com.wiki.tech.mapper.AuthorMapper;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserDao {
    private final AuthorMapper authorMapper;

    public void insertUser(UserDto.JoinRequest joinRequest){
        authorMapper.insertAuthor(joinRequest);
    }
}
