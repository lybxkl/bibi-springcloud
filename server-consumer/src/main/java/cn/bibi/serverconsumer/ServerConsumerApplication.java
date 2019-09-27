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

    /**
     * 加入restTemplate以消费相关的服务*
     * rest方式底层是HttpClient技术
     * RestTemplate 是由Spring Boot Web组件提供 默认整合ribbon负载均衡器
     *
     **/
    @Bean
    @LoadBalanced
    /**
     * 上面两个注解 可以解决rest模板找不到的bug 就是注册到springboot容器中
     */
    RestTemplate restTemplate()
    {
        return new RestTemplate();
    }
}
