package com.dt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author jiangyao
 * @Date 2019/6/27 9:35
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class MailApplication {

    private final static Logger LOGGER = LoggerFactory.getLogger(MailApplication.class);

    public static void main(String[] args) {

        SpringApplication app = new SpringApplication(MailApplication.class);
        app.run(args);

        LOGGER.info("dt-cloud-mail start Success");
    }
}
