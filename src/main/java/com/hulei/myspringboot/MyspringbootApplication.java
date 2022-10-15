package com.hulei.myspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 主程序类-
 * @SpringBootApplication:这是一个SpringBoot应用
 */

@SpringBootApplication
public class MyspringbootApplication {

    public static void main(String[] args) {
//        返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(MyspringbootApplication.class, args);
//        查看容器里面的组件
        String names[] = run.getBeanDefinitionNames();
        for(String name : names){
            System.out.println("name = " + name);
        }
    }

}
