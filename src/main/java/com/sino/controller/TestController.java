package com.sino.controller;

import com.sino.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tianpengcheng on 11/13/2020.
 */
@RestController
public class TestController {
    @Autowired
    TestMapper mapper;
    @GetMapping("/index")
    public String index(){
        return mapper.getById(1).toString();
    }
}
