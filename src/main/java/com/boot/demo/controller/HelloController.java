package com.boot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description:
 * @Author: heyuanxin3
 * @Date: 2020/6/17 20:46
 */
@Controller
public class HelloController {

    @RequestMapping("/")
    @ResponseBody
    public String getHello() {
        return "hello";
    }

}
