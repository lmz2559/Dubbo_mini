package com.lanly.consumer.controller;

import com.lanly.service.service.ITestService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("")
public class TestController {
    @Reference
    private ITestService testService;

    @ResponseBody
    @RequestMapping("/test")
    public void test(){
        testService.test();
    }
}
