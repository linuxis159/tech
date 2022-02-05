package com.wiki.tech.domain;


import lombok.extern.slf4j.Slf4j;

import java.util.Stack;

@Slf4j
public class DocsContentProcess {

    private Stack<Integer> stack = new Stack();

    public String processContent(String content){

        for(int i=0; i<content.length(); i++){
            if(content.charAt(i) == '{'){
                for(int j=i+1;j<content.length();j++){
                    String docsTitle = "";
                    if(content.charAt(j) == '}'){
                        content = processLink(content,i,j);
                        i=j;
                        break;
                    }

                }
            }
        }
        return content;
    }

    private String processLink(String content,int start,int end){
        String contentTitle = content.substring(start+1,end);
        log.info("ProcessLink_ContentTitle:"+contentTitle);
        StringBuffer sb = new StringBuffer(content);
        String link = "<a href='/docs/"+contentTitle+ "'>"+contentTitle+"<a/>";
        log.info("ProcessLink_Link:"+link);
        sb.replace(start,end,link);
        return sb.toString();


    }


}
