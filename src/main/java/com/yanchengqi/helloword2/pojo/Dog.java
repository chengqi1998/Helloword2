package com.yanchengqi.helloword2.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
//将像下面的类添加到容器里
@Component
public class Dog {
//    可以使用@Value赋值
    @Value("旺财")
    private String name;
    @Value("3")
    private String age;
//使用ALT+Insert快速生产函数，下面两个是构造函数
    public Dog() {
    }

    public Dog(String name, String age) {
        this.name = name;
        this.age = age;
    }
//Gitter AND SETTER 生成读取和设置函数，用来访问内部的数据
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
//toString函数，打印输出
    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
