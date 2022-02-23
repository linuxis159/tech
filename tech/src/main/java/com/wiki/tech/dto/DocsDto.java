package com.wiki.tech.dto;


import lombok.*;
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
    @AllArgsConstructor
    @NoArgsConstructor
    @ToString
    public static class ResponseDocs{
        private String title;
        private List<Paragraph> paragraphs;
        private List<String> prerequisiteSubject;
        private int flag = 0;
        private Date createdDate;
    }

    @Getter
    @Setter
    @ToString
    public static class Paragraph{
        private String title;
        private String article;
    }
}
