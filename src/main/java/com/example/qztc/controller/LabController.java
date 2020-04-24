package com.example.qztc.controller;

import com.example.qztc.redis.RedisOpt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LabController {
    @Autowired
    private RedisTemplate redisTemplate;

    RedisOpt redisOpt;


    @RequestMapping("/redis")
    public Boolean queryRedis(){
        boolean result = redisTemplate.hasKey("s_sdk_info");
        //redisOpt.opt();
        return result;
    }

}
