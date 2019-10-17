package cn.bibi.fallback;

import cn.bibi.feign.FeignTest;
import cn.bibi.order.entity.Class;
import org.springframework.stereotype.Component;

/**
 * @program: ljobin
 * @description: 统一降级实现
 * @author: Mr.Liu
 * @create: 2019-10-17 10:09
 **/
@Component
public class ComsumerServiceFallback implements FeignTest {
    /**
     * 写服务降级的一些友好提示
     * @return
     */
    @Override
    public Class getClazz() {
        return new Class("服务器忙(以类的方式进行服务降级)",400);
    }
}
