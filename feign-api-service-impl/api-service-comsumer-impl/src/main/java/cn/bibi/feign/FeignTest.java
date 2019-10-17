package cn.bibi.feign;

import cn.bibi.fallback.ComsumerServiceFallback;
import cn.bibi.order.api.Test;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @program: ljobin
 * @description:
 * @author: Mr.Liu
 * @create: 2019-10-02 00:10
 **/
@FeignClient(name = "api-service-provider" , fallback = ComsumerServiceFallback.class)
public interface FeignTest extends Test {
    //服务降级 熔断
    // 实体类是存放在接口项目里面还是 存放在实现项目里面 （答案是接口项目里面）
    //实体类和定义接口信息存放在接口项目
    //代码实现存放在接口实现类里面
}
