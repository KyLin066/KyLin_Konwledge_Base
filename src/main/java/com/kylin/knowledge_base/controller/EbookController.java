package com.kylin.knowledge_base.controller;

import com.kylin.knowledge_base.req.EbookReq;
import com.kylin.knowledge_base.resp.CommonResp;
import com.kylin.knowledge_base.resp.EbookResp;
import com.kylin.knowledge_base.resp.PageResp;
import com.kylin.knowledge_base.service.EbookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/ebook")
public class EbookController {

    @Resource
    private EbookService ebookService;

    @GetMapping("/list")
    public CommonResp list(EbookReq req) {
        CommonResp<PageResp<EbookResp>> resp = new CommonResp<>();
        PageResp<EbookResp> list = ebookService.list(req);
        resp.setContent(list);
        return resp;
    }
}
