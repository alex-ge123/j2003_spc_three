package com.qf.j2003.service.impl;

import com.qf.j2003.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by jeffrey on 2020/9/23.
 *
 */
@Service
public class
RibbonServiceImpl implements RibbonService {
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public String getMsgFromRemote(String msg) {
        try {
            String url = "http://producer-service2/proMsg?msg={0}";
            String object = restTemplate.getForObject(url, String.class, msg);
            return object;
        }catch(Exception ex){
            System.out.println("1");
        }
       return null;
    }
}
