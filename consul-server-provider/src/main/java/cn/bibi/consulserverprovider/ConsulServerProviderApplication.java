package cn.bibi.consulserverprovider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuyanbin
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ConsulServerProviderApplication {
    @Value("${server.port}")
    private String port;

    @GetMapping("/cs_pro")
    public String cs_test(){
        return "服务提供者：这里在调用:-->cs_provider"+port;
    }
    public static void main(String[] args) {
        SpringApplication.run(ConsulServerProviderApplication.class, args);
    }

}
