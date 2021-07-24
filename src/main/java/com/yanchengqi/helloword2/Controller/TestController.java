package com.yanchengqi.helloword2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

@Controller
public class TestController {
    private char a[]={'a','b'};
    String[] strings = {"aa", "bb", "cc"};
    @RequestMapping("/test")
    public String test(Model model){
        model.addAttribute("msg","<h1>hellospringboot</h1>");
        model.addAttribute("users", Arrays.asList("dog","pig","cat"));
        model.addAttribute("number",Arrays.asList(strings));
        return "test";
    }
}
