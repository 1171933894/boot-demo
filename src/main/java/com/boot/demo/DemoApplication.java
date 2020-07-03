package com.boot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication是一个组合注解：该注解用来说明被标注的类为SpringBoot的主配置类，如果想要启动该SpringBoot应用就需要运行这个类的main方法，这个方法就是主入口。
 */
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        System.out.println ("begin start");
        SpringApplication.run (DemoApplication.class, args);
        System.out.println ("end start");
    }

}
