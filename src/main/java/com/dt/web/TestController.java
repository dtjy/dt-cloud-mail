package com.dt.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author jiangyao
 * @Date 2020/4/28 21:45
 **/
@Controller
@RequestMapping("test")
public class TestController {

    private final static Logger LOGGER = LoggerFactory.getLogger(TestController.class);

    @Autowired
    DiscoveryClient discoveryClient;


    @ResponseBody
    @RequestMapping("t1")
    public String t1() {
        ServiceInstance serviceInstance = discoveryClient.getLocalServiceInstance();
        LOGGER.info(serviceInstance.getHost());
        LOGGER.info(serviceInstance.getServiceId());
        LOGGER.info(serviceInstance.getPort()+"");
        return "test1";
    }
}
