package com.example.mall.web.Controller;

import com.example.mall.web.rest.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Autowired(required = false)
    private HelloRemote helloRemote;

    @Autowired
    RestTemplate restTemplate;


    @RequestMapping(value = "/hello")
    public String hello(){
        return helloRemote.helloProvider();

    }
    //RestTemplate方式调用
    @RequestMapping(value = "/hello2")
    public String hello2() {
        return restTemplate.getForObject("http://eurekaprovider/hello/provider", String.class);
//        return restTemplate.getForEntity("http://localhost:9094/hello/provider", String.class).getBody();
    }
}