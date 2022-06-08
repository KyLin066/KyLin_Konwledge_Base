package com.kylin.knowledge_base.mapper;

import com.kylin.knowledge_base.resp.StatisticResp;

import java.util.List;

public interface EbookSnapshotMapperCust {
    public void genSnapshot();

    List<StatisticResp> getStatistic();
}
