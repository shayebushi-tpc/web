package com.sino.service.serviceimple;

import com.sino.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by tianpengcheng on 11/13/2020.
 */
@Service
public class RedisServceImpl implements RedisService {

    @Autowired
    RedisTemplate redisTemplate;
    @Override
    public boolean setObj(String key, Object object) {
        redisTemplate.opsForValue().set(key,object);
        return true;
    }

    @Override
    public Object getObj(String key) {
        return redisTemplate.opsForValue().get(key);
    }
}
