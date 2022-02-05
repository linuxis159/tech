package com.wiki.tech.controller;

import com.wiki.tech.domain.DocsContentProcess;
import com.wiki.tech.dto.DocsDto;
import com.wiki.tech.service.DocsService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/docs")
public class DocsController {
    private final DocsService docsService;

    @PostMapping("/add")
    String addDocs(@RequestBody DocsDto.AddRequest addRequest){
        log.info("ADD_REQUEST:"+addRequest.toString());
        DocsContentProcess docsContentProcess = new DocsContentProcess();
        addRequest.setContent(docsContentProcess.processContent(addRequest.getContent()));
        int docs_index = docsService.addDocs(addRequest);
        return "";
    }
    @GetMapping("/search/{title}")
    DocsDto.ResponseDocs getDocs(@PathVariable("title") String title){
        log.info("TITLE:"+title);
        DocsDto.SearchRequest searchRequest = new DocsDto.SearchRequest();
        searchRequest.setTitle(title);
        DocsDto.ResponseDocs responseDocs = docsService.getDocs(searchRequest);
        log.info(responseDocs.toString());
        return responseDocs;
    }

}
