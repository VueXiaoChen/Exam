package com.example.wiki.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.wiki.domain.TestDaomain;
import com.example.wiki.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class TestController {
    @RequestMapping ("/hellow")
    public String Hello(){
        return "123";
    }
    @Resource
    private TestService testService;
    @GetMapping("/test/list")
    public List<TestDaomain> list(){
        return testService.list();
    }
}
