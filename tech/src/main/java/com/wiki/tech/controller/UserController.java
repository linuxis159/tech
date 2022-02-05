package com.wiki.tech.controller;

import com.wiki.tech.domain.DocsContentProcess;
import com.wiki.tech.dto.UserDto;
import com.wiki.tech.dto.Response;
import com.wiki.tech.service.AuthorService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class UserController {
    private final AuthorService userService;

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
