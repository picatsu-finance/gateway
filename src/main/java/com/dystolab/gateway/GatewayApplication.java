package com.dystolab.gateway;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.client.RestTemplate;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

@SpringBootApplication
@EnableAsync
@EnableCaching
@EnableZuulProxy
@EnableAdminServer
public class GatewayApplication {

	/*
	Swagger : http://localhost:9090/swagger-ui.html#
	Example request from Front  http://localhost:9090/patient/api/v1/patient/gethello
	The first "patient" is the name of the service
	 */
	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);

	}


}
