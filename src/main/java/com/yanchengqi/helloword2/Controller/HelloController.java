package com.yanchengqi.helloword2.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//核心原理，自动装配
@RestController
public class HelloController {
//    接口：http://localhost:8080/hello.
    @RequestMapping("/hello")
    public String hello() {
//        调用业务，接受前端参数
        return "hello!";
    }
}
