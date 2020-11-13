package com.sino;

import com.sino.service.RedisService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.security.RunAs;

@SpringBootTest
class MybatisApplicationTests {

	@Autowired
	RedisTemplate redis;
	@Test
	void contextLoads() {
		redis.opsForValue().set("key","aaa");
	}
	@Test
	void getKey(){
		Object key = redis.opsForValue().get("key");
		System.out.println(key);
	}

}
