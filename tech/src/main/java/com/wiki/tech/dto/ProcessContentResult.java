package com.wiki.tech.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ProcessContentResult {
    private String content;
    private List<String> contents;
}
