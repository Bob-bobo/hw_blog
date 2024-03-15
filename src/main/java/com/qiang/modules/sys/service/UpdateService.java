/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2023-2023. All rights reserved.
 */

package com.qiang.modules.sys.service;/**
 * @author zhengbo d00669615
 * @date 2023/12/17
 */

import com.qiang.common.utils.PagedResult;

/**
 * TODO
 *
 * @author d00669615
 * @since 2023-12-17 22:07
 */
public interface UpdateService {

    PagedResult findAllUpdates(Integer page, Integer pageSize);
}
