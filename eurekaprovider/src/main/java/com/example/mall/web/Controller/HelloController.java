package com.example.mall.web.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hp on 2018/7/6.
 */

@RestController
public class HelloController {
    @RequestMapping(value = "/hello/provider")
    public String helloProvider() {
        return "I am is provider ,hello world";
    }
}
