/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2023-2023. All rights reserved.
 */

package com.qiang.modules.sys.service.impl;/**
 * @author zhengbo d00669615
 * @date 2023/12/17
 */

import com.qiang.common.utils.PagedResult;
import com.qiang.modules.sys.service.UpdateService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * TODO
 *
 * @author d00669615
 * @since 2023-12-17 22:09
 */
@Service
public class UpdateServiceImpl implements UpdateService {

    @Transactional(propagation =  Propagation.SUPPORTS)
    @Override
    public PagedResult findAllUpdates(Integer page, Integer pageSize) {
        PagedResult result = new PagedResult();

        return null;
    }
}
