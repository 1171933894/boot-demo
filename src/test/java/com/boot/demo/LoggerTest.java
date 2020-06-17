package com.boot.demo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description:
 * @Author: heyuanxin3
 * @Date: 2020/6/17 21:21
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {
    private final Logger logger = LoggerFactory.getLogger (LoggerTest.class);

    /**
     * 传统方式实现日志
     */
    @Test
    public void test1() {
        logger.debug ("++++++++++++++++++++++++++++++debug");//默认日志级别为info
        logger.info ("++++++++++++++++++++++++++++++info");
        logger.error ("++++++++++++++++++++++++++++++error");
        logger.warn ("++++++++++++++++++++++++++++++warn");
    }

    /**
     * Slf4j注解方式实现日志
     */
    @Test
    public void test2() {
        log.debug ("-----------------------------debug");//默认日志级别为info
        log.info ("-----------------------------info");
        log.error ("-----------------------------error");
        log.warn ("-----------------------------warn");
    }

}