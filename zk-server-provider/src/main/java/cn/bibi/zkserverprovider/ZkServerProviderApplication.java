package cn.bibi.zkserverprovider;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ZkServerProviderApplication {

    @Value("${server.port}")
    private String port;

    @GetMapping("/zkPro")
    public String zk_test(){
        return "这是zookeeper注册中心"+port;
    }
    public static void main(String[] args) {
        SpringApplication.run(ZkServerProviderApplication.class, args);
    }

}
