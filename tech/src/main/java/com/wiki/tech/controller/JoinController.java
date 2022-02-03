package com.wiki.tech.controller;

import com.wiki.tech.dto.UserDto;
import com.wiki.tech.dto.Response;
import com.wiki.tech.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequiredArgsConstructor
public class JoinController {
    private final UserService userService;

    @GetMapping("/join")
    public String joinRequestForm(){

        return "";
    }

    @PostMapping("/join")
    public String joinRequest(@RequestBody UserDto.JoinRequest joinRequest){
        log.info("JOIN_REQUEST:"+joinRequest.toString());
        userService.join(joinRequest);
        return "";
    }
}
