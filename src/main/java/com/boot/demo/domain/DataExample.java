package com.boot.demo.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;
import lombok.ToString;

/**
 * @Description:
 * @Author: heyuanxin3
 * @Date: 2020/6/17 20:58
 */

/**
 * Lombok的最大缺点：
 * 不支持多种参数构造器的重载
 */
@Data
public class DataExample {
    private final String name;
    @Setter(AccessLevel.PACKAGE)
    private int age;
    private double score;
    private String[] tags;

    @ToString(includeFieldNames = true)
    @Data(staticConstructor = "of")
    public static class Exercise<T> {
        private final String name;
        private final T value;
    }

}