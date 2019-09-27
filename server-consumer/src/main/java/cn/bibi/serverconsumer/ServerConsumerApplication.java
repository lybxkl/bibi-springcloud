package cn.bibi.serverconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @EnableDiscoveryClient 表明标注类是消费者
 * @author liuyanbin
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ServerConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerConsumerApplication.class, args);
    }

    /**
     * 在SpringCloud中有两种方式调用 ：
     *              rest（由Spring Boot Web组件提供）和
     *              fegin（SpringCloud提供）
     * @return
     */
    @Bean
    @LoadBalanced
    /**
     * 加入restTemplate以消费相关的服务*
     * RestTemplate 是由Spring Boot Web组件提供
     **/
    RestTemplate restTemplate()
    {
        return new RestTemplate();
    }
}
