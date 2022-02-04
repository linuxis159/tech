package com.wiki.tech.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.bind.annotation.GetMapping;

public class DocsDto {

    @Getter
    @Setter
    @ToString
    public static class AddRequest{
        private int author_index;
        private int docs_index;
        private String title;
        private String content;

    }
}
