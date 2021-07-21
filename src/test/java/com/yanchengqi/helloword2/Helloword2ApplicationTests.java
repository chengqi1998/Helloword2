package com.yanchengqi.helloword2;

import com.yanchengqi.helloword2.pojo.Dog;
import com.yanchengqi.helloword2.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
//单元测试工具
@SpringBootTest
class Helloword2ApplicationTests {
//将本类的值和容器中的匹配
    @Autowired
    private Dog dog;
    @Autowired
    private Person person;
    @Test
    void contextLoads() {
//        System.out.println(dog);
        System.out.println(person);
    }

}
