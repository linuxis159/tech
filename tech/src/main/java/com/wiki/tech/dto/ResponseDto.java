package com.wiki.tech.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.ibatis.annotations.Select;

@Getter
@Setter
@ToString
public class ResponseDto {
    private String title;
}
