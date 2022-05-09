package com.kylin.knowledge_base.service;

import com.kylin.knowledge_base.domain.Ebook;
import com.kylin.knowledge_base.mapper.EbookMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class EbookService {
    @Resource
    private EbookMapper ebookMapper;

    public List<Ebook> list() {
        return ebookMapper.selectByExample(null);
    }
}
