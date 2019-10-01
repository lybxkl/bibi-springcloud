package cn.bibi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Hello world!
 *
 */
@EnableEurekaClient
@SpringBootApplication
@EnableFeignClients
public class Application2
{
    public static void main( String[] args )
    {
        SpringApplication.run(Application2.class,args);
    }
}
