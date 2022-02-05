package com.wiki.tech.dto;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

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
    public static class ResponseDocs{
        private String title;
        private String content;
        private Date createdDate;
    }
}
