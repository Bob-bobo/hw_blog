/*
 * Copyright (c) Huawei Technologies Co., Ltd. 2023-2023. All rights reserved.
 */

package com.qiang.modules.sys.controller;/**
 * @author zhengbo d00669615
 * @date 2023/12/17
 */

import com.qiang.common.utils.BlogJSONResult;
import com.qiang.modules.sys.service.UpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO
 *
 * @author d00669615
 * @since 2023-12-17 22:06
 */
@RestController
public class UpdateController {

    @Autowired
    private UpdateService updateService;

    @GetMapping("getAllUpdates")
    public BlogJSONResult getAllUpdates() {
        BlogJSONResult updates = new BlogJSONResult();

        return updates;
    }
}
