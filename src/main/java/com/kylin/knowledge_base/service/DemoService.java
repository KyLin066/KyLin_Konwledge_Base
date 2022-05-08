package com.kylin.knowledge_base.service;

import com.kylin.knowledge_base.domain.Demo;
import com.kylin.knowledge_base.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DemoService {
    @Resource
    private DemoMapper demoMapper;

    public List<Demo> list() {
        return demoMapper.selectByExample(null);
    }
}
