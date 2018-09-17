package com.springboot.web;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * 定时任务demo,可是统计些数据。项目中我遇到的场景是试卷的自动提交（时间到交卷）
 */
@Configuration
@EnableScheduling
public class SchedulingConfig {

//    @Scheduled(cron = "0/5 * * * * ?") // 每5秒执行一次,cron没记错是个表达式
//    public void scheduler() {
//        System.out.println(">>>>>>>>> SchedulingConfig.scheduler()");
//
//    }
}
