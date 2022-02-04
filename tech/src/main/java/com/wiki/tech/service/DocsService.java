package com.wiki.tech.service;

import com.wiki.tech.dao.AuthorDocsMapDao;
import com.wiki.tech.dao.DocsDao;
import com.wiki.tech.dto.DocsDto;
import com.wiki.tech.dao.AuthorDocsMapDao;
import com.wiki.tech.mapper.AuthorDocsMapMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Slf4j
@RequiredArgsConstructor
public class DocsService {
    private final DocsDao docsDao;

    private final AuthorDocsMapDao authorDocsMapDao;

    @Transactional
    public int addDocs(DocsDto.AddRequest addRequest){
        addRequest.setAuthor_index(7);
        docsDao.save(addRequest);
        log.info("ADDREQUEST:"+addRequest.toString());
        authorDocsMapDao.save(addRequest);
        return addRequest.getDocs_index();
    }

}
