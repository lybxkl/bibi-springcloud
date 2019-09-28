package cn.bibi.zookeeper;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @EnableDiscoveryClient 作用是
 *              如果服务使用connsul、zookeeper
 *              则使用该注解向注册中心注册服务
 * @author liuyanbin
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ZookeeperApplication {

    @Value("${server.port}")
    private String port;

    @GetMapping("/zk_test")
    public String zk_test(){
        return "这是zookeeper注册中心";
    }

    public static void main(String[] args) {
        SpringApplication.run(ZookeeperApplication.class, args);
    }

}
