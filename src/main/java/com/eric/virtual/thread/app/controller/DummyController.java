/**
 * @(#)DummyController.java, 2024/1/26.
 * <p/>
 * Copyright 2024 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.eric.virtual.thread.app.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author shenbingtong (shenbingtong@corp.netease.com)
 */
@RestController
@RequestMapping("/api/v1/dummy")
@Slf4j
public class DummyController {
    @GetMapping
    private void dummy() {
        log.info("rest api has been called {}", Thread.currentThread());
    }

}
