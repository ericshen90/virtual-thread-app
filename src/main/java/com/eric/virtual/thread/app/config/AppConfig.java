/**
 * @(#)AppConfig.java, 2024/1/26.
 * <p/>
 * Copyright 2024 Netease, Inc. All rights reserved.
 * NETEASE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package com.eric.virtual.thread.app.config;

import com.eric.virtual.thread.app.executor.AsyncTaskExecutorService;
import jakarta.annotation.Resource;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author shenbingtong (shenbingtong@corp.netease.com)
 */
@Configuration
@EnableAsync
@EnableScheduling
public class AppConfig implements ApplicationListener<ContextRefreshedEvent> {

    @Resource
    private AsyncTaskExecutorService asyncTaskExecutorService;


    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        asyncTaskExecutorService.asyncTask();
    }

}
