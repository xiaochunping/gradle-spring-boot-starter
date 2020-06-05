package com.study.starter.hello;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Getter
@Setter
@ConfigurationProperties(prefix = "allen")
public class HelloProperties {

    // 姓名
    private String name;

    // 年龄
    private Integer age;

    // 家乡
    private String hometown;

}
