package com.wiki.tech.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;
import java.util.List;

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

    @Getter
    @Setter
    @ToString
    public static class SearchRequest{
        private String title;
    }

    @Getter
    @Setter
    @ToString
    public static class ResponseDocs extends ResponseDto{
        private String content;
        private List<String> contents;
        private Date createdDate;
    }
}
