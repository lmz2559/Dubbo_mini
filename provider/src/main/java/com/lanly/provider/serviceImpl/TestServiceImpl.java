package com.lanly.provider.serviceImpl;

import com.lanly.service.service.ITestService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class TestServiceImpl implements ITestService {
    @Override
    public void test() {
        System.out.println("进入测试");
    }
}
