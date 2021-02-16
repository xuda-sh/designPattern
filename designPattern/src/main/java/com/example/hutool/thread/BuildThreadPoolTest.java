package com.example.hutool.thread;

import cn.hutool.core.thread.ExecutorBuilder;
import cn.hutool.core.thread.ThreadFactoryBuilder;

import java.util.concurrent.*;

public class BuildThreadPoolTest {

    public ExecutorService getThreadPool(){
        ThreadPoolExecutor poolExecutor=ExecutorBuilder.create().setCorePoolSize(3)
                .setMaxPoolSize(3<<1)
                .setKeepAliveTime(10, TimeUnit.SECONDS)
                .setWorkQueue(new LinkedBlockingDeque<>(500))
                .setHandler(new ThreadPoolExecutor.AbortPolicy())
                .setThreadFactory(ThreadFactoryBuilder.create().setNamePrefix("biz-type-").build()).build();
        return poolExecutor;
    }
    public static void main(String[] args) {

    }

}
