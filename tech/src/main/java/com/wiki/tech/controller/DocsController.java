package com.wiki.tech.controller;

import com.wiki.tech.domain.DocsContentProcess;
import com.wiki.tech.dto.DocsDto;
import com.wiki.tech.dto.ProcessContentResult;
import com.wiki.tech.service.DocsService;
import com.wiki.tech.vo.Docs;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@RestController
@Slf4j
@RequiredArgsConstructor
@RequestMapping("/docs")
public class DocsController {
    private final DocsService docsService;

    @PostMapping("/add")
    String addDocs(@RequestBody DocsDto.AddRequest addRequest){
        int docs_index = docsService.addDocs(addRequest);
        return "";
    }

    @GetMapping("/search/{title}")
    DocsDto.ResponseDocs getDocs(@PathVariable("title") String title, HttpServletResponse response) throws IOException {
        final String EMPTY_DOCS_REDIRECT = "http://localhost/docs/empty";
        DocsContentProcess docsContentProcess = new DocsContentProcess();
        DocsDto.SearchRequest searchRequest = new DocsDto.SearchRequest();
        log.info("TITLE:"+title);
        searchRequest.setTitle(title);
        Docs docs = docsService.getDocs(searchRequest);

//        if(docs.getTitle() == null ){
//            docs.setTitle("결과를 찾지 못했습니다");
//            responseDocs.setFlag(1);
//        }
        DocsDto.ResponseDocs responseDocs = docsContentProcess.processContent(docs);
        log.info(responseDocs.toString());
        return responseDocs;
    }

}
