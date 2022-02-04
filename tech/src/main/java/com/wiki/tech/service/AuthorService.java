package com.wiki.tech.service;

import com.wiki.tech.dao.AuthorDao;
import com.wiki.tech.dto.UserDto;
import com.wiki.tech.vo.Author;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorService {
    private final AuthorDao authorDao;

    public void join(UserDto.JoinRequest joinRequest){
        authorDao.save(joinRequest);
    }
}
