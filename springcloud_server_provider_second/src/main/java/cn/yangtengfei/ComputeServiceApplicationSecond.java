package cn.yangtengfei;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class ComputeServiceApplicationSecond {
    public static void main(String[] args) {
		new SpringApplicationBuilder(ComputeServiceApplicationSecond.class).web(true).run(args);
	}
}