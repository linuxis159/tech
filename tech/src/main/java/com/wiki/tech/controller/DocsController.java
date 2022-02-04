package com.wiki.tech.controller;

import com.wiki.tech.dto.DocsDto;
import com.wiki.tech.service.DocsService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/docs")
public class DocsController {
    private final DocsService docsService;

    @PostMapping("/add")
    String addDocs(@RequestBody DocsDto.AddRequest addRequest){
        log.info("ADD_REQUEST:"+addRequest.toString());
        int docs_index = docsService.addDocs(addRequest);
        return "";
    }

}
