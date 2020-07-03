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

    //@RequestMapping:标注该方法将处理浏览的的hello请求
    //@ResponseBody:将controller的方法返回的对象通过适当的转换器转换为指定的格式之后，
    //写入到response对象的body区，通常用来返回JSON数据或者是XML数据
    @RequestMapping("/")
    @ResponseBody
    public String getHello() {
        return "hello";
    }

}
