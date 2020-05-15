package com.yzx.dubboprovider.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.yzx.dubboapi.service.UserService;

@Service(version = "${demo.service.version}")
public class UserServiceImpl implements UserService {

    @Override
    public String getUser() {
        return "aaaa";
    }
}
