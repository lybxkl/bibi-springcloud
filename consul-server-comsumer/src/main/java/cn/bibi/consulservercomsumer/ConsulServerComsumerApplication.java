package cn.bibi.consulservercomsumer;

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
 * @author liuyanbin
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ConsulServerComsumerApplication {
    @Autowired
    RestTemplate restTemplate;

    @Value("${server.port}")
    private String port;

    @GetMapping("/cs_test")
    public String zk_test(){
        String Url = "http://127.0.0.1:8510/cs_pro";
        return "消费者："+port+"这里在调用:-->"+restTemplate.getForObject(Url,String.class);
    }
    public static void main(String[] args) {
        SpringApplication.run(ConsulServerComsumerApplication.class, args);
    }

    @Bean
//    @LoadBalanced  //取消了负载均衡器，只能使用ip地址访问
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
