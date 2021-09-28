package com.zk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 请求转发
 */
@Controller
public class RequestforwardingController {
    @RequestMapping("view1")
    public ModelAndView view1(){
        ModelAndView model = new ModelAndView();
        model.addObject("msg","success....");
        model.setViewName("view");
        return model;
    }
}
