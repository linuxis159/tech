package com.wiki.tech.service;

import com.wiki.tech.dao.UserDao;
import com.wiki.tech.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserDao userDao;

    public void join(UserDto.JoinRequest joinRequest){
        userDao.insertUser(joinRequest);
    }
}
