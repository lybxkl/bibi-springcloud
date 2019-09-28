package cn.bibi.zookeeper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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

    @Autowired
    RestTemplate restTemplate;

    @Value("${server.port}")
    private String port;

    @GetMapping("/zk_test")
    public String zk_test(){
        String Url = "http://zk-Server-Provider/zkPro";
        return "这里在调用:-->"+restTemplate.getForObject(Url,String.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(ZookeeperApplication.class, args);
    }

    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
