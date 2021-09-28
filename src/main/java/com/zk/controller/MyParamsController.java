package com.zk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyParamsController {
    @RequestMapping("param1")
    public String param(Integer age){
        System.out.println("age:" + age);
        return "param1";
    }
}
