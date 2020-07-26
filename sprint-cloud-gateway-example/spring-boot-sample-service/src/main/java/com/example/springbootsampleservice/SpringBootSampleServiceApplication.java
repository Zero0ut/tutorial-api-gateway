package com.example.springbootsampleservice;

import com.example.springbootsampleservice.config.RibbonConfiguration;
import com.example.springbootsampleservice.util.SpringBootUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name = "server", configuration = RibbonConfiguration.class)
public class SpringBootSampleServiceApplication {

	private static final Logger logger = LoggerFactory.getLogger(SpringBootSampleServiceApplication.class);

	public static void main(String[] args) {
		SpringBootUtil.setRandomPort(5000, 5500);
		ApplicationContext ctx = SpringApplication.run(SpringBootSampleServiceApplication.class, args);
		logger.info("SpringBootSampleServiceApplication " + ctx.getApplicationName() + " started");
	}

}
