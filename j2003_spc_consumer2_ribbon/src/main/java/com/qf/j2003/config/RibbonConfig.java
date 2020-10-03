package com.qf.j2003.config;

import com.netflix.loadbalancer.*;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

/**
 * Created by jeffrey on 2020/9/23.
 */
@Configuration
public class RibbonConfig {

    @Bean
    @LoadBalanced   //实现客户端负载均衡
    public RestTemplate  restTemplate(){
        return new RestTemplate();
    }
//    配置负载均衡策略
    @Bean
    public IRule  ribbonRule(){
     return   new RoundRobinRule();//轮询
//        new WeightedResponseTimeRule(); //根据响应时间的权重策略
//        new BestAvailableRule(); //最有并发时间最少
//        return new RandomRule();//随即策略
    }
}
