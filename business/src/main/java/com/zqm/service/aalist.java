/**
 * Copyright (C) 2006-2019 Tuniu All rights reserved
 */
package com.zqm.service;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * ConfigurationProperties 注入一个类，对象 --支持宽松绑定
 * 1.5之前还有location属性，指定文件 代替方案@PropertySource
 * prefix前缀定义了哪些外部属性将绑定到类的字段上
 * ignoreInvalidFields 设置为true 绑定失败程序不会报错
 * 根据 Spring Boot 宽松的绑定规则，类的属性名称必须与外部属性的名称匹配
 * 我们可以简单地用一个值初始化一个字段来定义一个默认值
 * 类本身可以是包私有的
 * 类的字段必须有公共 setter 方法
 * <p>
 * <p>
 * Value("${zk.register.merinfo}") 注入地址等简单方式
 *
 * @author zhaqianming
 * <p>
 * Date: 2019-11-05
 */

@Component
@PropertySource("classpath:aalist.yml")
@ConfigurationProperties(prefix = "aalist")

public class aalist {
    private String name;
    private List<String> myList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getList() {
        return myList;
    }

    public void setList(List<String> list) {
        this.myList = list;
    }
}
