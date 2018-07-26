package com.example.mall.web.rest;



import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hp on 2018/7/6.
 */

@FeignClient(value= "eurekaprovider")
public interface HelloRemote {
    //这个接口要和远程调用的接口一只，参数，接口名，返回类型
    @RequestMapping(value = "/hello/provider")
    public String helloProvider();
}
