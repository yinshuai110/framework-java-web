package com.winter.base.framework.controller.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BasicWebController {

    @RequestMapping("/getUser")
    public String getUser(){
        return "111111111111";
    }
}
