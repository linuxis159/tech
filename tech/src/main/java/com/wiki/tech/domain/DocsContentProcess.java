package com.wiki.tech.domain;


import com.wiki.tech.dto.DocsDto;
import com.wiki.tech.dto.ProcessContentResult;
import com.wiki.tech.vo.Docs;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@Slf4j
public class DocsContentProcess {

    private Stack<Integer> stack = new Stack();
    private List<DocsDto.Paragraph>  paragraphs = new ArrayList();
    private DocsDto.ResponseDocs responseDocs = new DocsDto.ResponseDocs();
    public DocsDto.ResponseDocs processContent(Docs docs){
        for(int i=0; i < docs.getContent().length(); i++){
            DocsDto.Paragraph paragraph = new DocsDto.Paragraph();
            String title = "";
            String article = "";
            try {
                if (docs.getContent().substring(i, i + 3).equals("== ")) {
                    for (int k = i + 3; k < docs.getContent().length(); k++) {
                        if (docs.getContent().substring(k, k + 3).equals(" ==")) {
                            log.info("타이틀:" + title);
                            paragraph.setTitle(title);
                            i = k+4;
                            break;
                        }
                        title += docs.getContent().charAt(k);
                    }

                    for (int j = i; j < docs.getContent().length(); j++) {
                        if(j+3 < docs.getContent().length()){
                            if (docs.getContent().substring(j, j + 3).equals("== ")) {
                                i = j - 1;
                                break;
                            }
                            article += docs.getContent().charAt(j);
                        }
                        else{
                            article += docs.getContent().charAt(j);
                            article += docs.getContent().charAt(j+1);
                            article += docs.getContent().charAt(j+2);
                            log.info("아티클" + article);
                            i = j+3;
                            break;
                        }

                    }
                }
            } catch (StringIndexOutOfBoundsException e){
                e.getMessage();
            }
            paragraph.setTitle(title);
            paragraph.setArticle(article);
            paragraphs.add(paragraph);
        }

    responseDocs.setTitle(docs.getTitle());
    responseDocs.setParagraphs(paragraphs);
    responseDocs.setFlag(1);
    responseDocs.setCreatedDate(docs.getCreatedDate());
    return responseDocs;
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
