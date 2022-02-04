package com.wiki.tech.vo;

import com.wiki.tech.enumeration.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Author {
    private long author_index;
    private String id;
    private String email;
    private String pass;
    private String role;
    private Date createdDate;

}
