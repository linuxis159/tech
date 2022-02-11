package com.wiki.tech.domain;


import com.wiki.tech.dto.ProcessContentResult;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@Slf4j
public class DocsContentProcess {

    private Stack<Integer> stack = new Stack();

    public ProcessContentResult processContent(String article){
        List<String> contents = new ArrayList();
        ProcessContentResult result = new ProcessContentResult();
        for(int i=0; i<article.length(); i++){
            try {
                if (article.substring(i, i + 3).equals("== ")) {
                    String content = "";
                    for (int j = i + 3; j < article.length(); j++) {
                        if (article.substring(j, j + 3).equals(" ==")) {
                            log.info(content);
                            contents.add(content);
                            i = j + 3;
                            break;
                        } else
                            content += article.charAt(j);
                    }
                }
            } catch(StringIndexOutOfBoundsException e){
                log.info(e.getMessage());
            }
            if(article.charAt(i) == '{'){
                for(int j=i+1;j<article.length();j++){
                    String docsTitle = "";
                    if(article.charAt(j) == '}'){
                        article = processLink(article,i,j);
                        i=j;
                        break;
                    }
                }
            }
        }
        result.setContent(article);
        result.setContents(contents);
        return result;
    }


    private String processLink(String content,int start,int end){
        String contentTitle = content.substring(start+1,end);
        log.info("ProcessLink_ContentTitle:"+contentTitle);
        StringBuffer sb = new StringBuffer(content);
        String link = "<a href='/docs/search/"+contentTitle+ "'>"+contentTitle+"<a/>";
        log.info("ProcessLink_Link:"+link);
        sb.replace(start,end,link);
        return sb.toString();
    }
}
