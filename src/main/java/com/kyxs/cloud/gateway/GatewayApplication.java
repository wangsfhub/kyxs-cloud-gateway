package com.kyxs.cloud.gateway;

import com.kyxs.cloud.loadbalance.config.CustomizeLoadBalancerRuleConfiguration;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableCaching
@Slf4j
@LoadBalancerClients(defaultConfiguration = CustomizeLoadBalancerRuleConfiguration.class) //自定义负载均衡策略
public class GatewayApplication {
	public static void main(String[] args) {
		SpringApplication.run(GatewayApplication.class, args);
		log.info(" SUCCESSFUL com.kyxs.cloud.gateway.GatewayApplication - 网关服务 kyxs-cloud-gateway:9000 启动成功！");
	}
}
