package com.yanchengqi.helloword2.config;

import jdk.internal.dynalink.beans.StaticClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.Locale;

//扩展springmvc
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

//    使用注释将产生的视图注入到容器里
    @Bean
    public  ViewResolver myViewReslover(){
        return new Myview();
    }
//    生成了我们的视图解析器
    public static class Myview implements ViewResolver {
        @Override
        public View resolveViewName(String s, Locale locale) throws Exception {
            return null;
        }
    }
}
