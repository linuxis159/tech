package com.wiki.tech.dto;

import lombok.*;
import org.apache.ibatis.annotations.Select;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ResponseDto {
    private String title;
}
