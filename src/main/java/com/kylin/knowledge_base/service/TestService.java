package com.kylin.knowledge_base.service;

import com.kylin.knowledge_base.domain.Test;
import com.kylin.knowledge_base.mapper.TestMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestService {
    @Resource
    private TestMapper testMapper;

    public List<Test> list() {
        return testMapper.list();
    }
}
