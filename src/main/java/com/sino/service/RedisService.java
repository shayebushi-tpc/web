package com.sino.service;

/**
 * Created by tianpengcheng on 11/13/2020.
 */
public interface RedisService {

    boolean setObj(String key,Object object);

    Object getObj(String key);
}
