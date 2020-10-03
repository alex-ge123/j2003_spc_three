package com.qf.j2003.controller;

import com.qf.j2003.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jeffrey on 2020/9/23.
 */
@RestController
public class ConsumerController {
    @Autowired
    private RibbonService ribbonService;
    
    @RequestMapping("/msg")
    public  String  msg(String msg){

        String str = ribbonService.getMsgFromRemote(msg);
        return  "get Msg ok:"+str;
    }
}
