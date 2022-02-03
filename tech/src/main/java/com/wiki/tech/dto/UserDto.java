package com.wiki.tech.dto;

import com.wiki.tech.enumeration.Role;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;


public class UserDto {
    private int author_index;
    private String id;
    private String email;
    private String pass;
    private Role role;
    private Date createdDate;

    @Getter
    @Setter
    @ToString
    public static class JoinRequest{
        private String id;
        private String email;
        private String password;
        private String passwordConform;
    }

    public static class JoinResponse{
        private int result;
    }


}
