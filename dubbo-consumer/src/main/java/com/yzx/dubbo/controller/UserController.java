package com.yzx.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yzx.dubboapi.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/com/yzx/user")
public class UserController {

    @Reference(version = "${demo.service.version}",timeout = 160000)
    private UserService userService;

    @RequestMapping("/getUser")
    @ResponseBody
    public String getUser(){
        String b = userService.getUser();
        System.out.println("b==="+b);
        return "xiaoxi";
    }
}
