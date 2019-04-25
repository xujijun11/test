package com.java.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther:xujijun
 * @Date:2019/4/25
 * @Description:com.java.ssm.controller
 * @Version：1.0
 */
@Controller
@RequestMapping("loginCtrl")
public class loginCtrl {
    @RequestMapping("toLogin")
    public String toLogin(){
        System.out.println("进入登录页面！！！！！！");
        return "login";
    }
}
