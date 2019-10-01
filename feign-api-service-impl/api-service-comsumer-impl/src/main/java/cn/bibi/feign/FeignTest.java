package cn.bibi.feign;

import cn.bibi.order.api.Test;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @program: ljobin
 * @description:
 * @author: Mr.Liu
 * @create: 2019-10-02 00:10
 **/
@FeignClient(name = "api-service-provider")
public interface FeignTest extends Test {
}
