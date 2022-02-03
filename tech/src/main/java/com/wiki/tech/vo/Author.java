package com.wiki.tech.vo;

import com.wiki.tech.enumeration.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Date;


@Getter
@AllArgsConstructor
public class Author {
    private int author_index;
    private String id;
    private String email;
    private String pass;
    private String role;
    private Date createdDate;

}
