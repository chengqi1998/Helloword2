package com.yanchengqi.helloword2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//程序的主入口，不允许删除修改
//@SpringBootApplication:标注这是一个springboot的应用，启动启动类所需要的资源。
@SpringBootApplication
class Helloword2Application {

    public static void main(String[] args) {
//        启动应用
        SpringApplication.run(Helloword2Application.class, args);
    }

}
