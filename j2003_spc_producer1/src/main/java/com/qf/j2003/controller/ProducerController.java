package com.qf.j2003.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jeffrey on 2020/9/23.
 */
@RestController
public class ProducerController {
    @Value("${server.port}")  //将配置文件中的server.port参数注入到port属性中
    private String port;
    @RequestMapping(value="/proMsg",method= RequestMethod.GET)
    public String getMsg(String msg){
        System.out.println("收到参数："+msg+"  port:"+port);

        return "recieve ok"+msg;

    }
}
