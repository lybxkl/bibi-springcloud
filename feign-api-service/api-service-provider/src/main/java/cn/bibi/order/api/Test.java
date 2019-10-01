package cn.bibi.order.api;

import cn.bibi.order.entity.Class;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: ljobin
 * @description: 实体类可以放在api接口模块下面
 * @author: Mr.Liu
 * @create: 2019-10-01 21:54
 **/
public interface Test {
    /**
     * 测试
     * @return
     */
    @RequestMapping("/getClazz")
    public Class getClazz();
}
