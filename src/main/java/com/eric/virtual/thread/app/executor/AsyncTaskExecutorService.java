/**
 * @(#)AsyncTaskExecutorService.java, 2024/1/26.
 * <p/>
 * Copyright 2024 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.eric.virtual.thread.app.executor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author shenbingtong (shenbingtong@corp.netease.com)
 */
@Component
@Slf4j
public class AsyncTaskExecutorService {

    @Async
    public void asyncTask() {
        log.info("async task has been called {}", Thread.currentThread());
    }

}
