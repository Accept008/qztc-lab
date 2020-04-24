package com.example.qztc.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class ScheduleService {

//    @Scheduled(cron = "0 55 11 * * *")
    @Scheduled(cron = "0 0/1 * * * ?")
    public void processScheduledPushSetting() {
        System.out.println("data -> " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
    }
}
