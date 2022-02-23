package com.wiki.tech.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Docs {
    private int docs_index;
    private String title;
    private String content;
    private Date CreatedDate;
}
