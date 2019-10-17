package cn.bibi.order;

import cn.bibi.order.api.Test;
import cn.bibi.order.entity.Class;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: ljobin
 * @description:
 * @author: Mr.Liu
 * @create: 2019-10-02 00:08
 **/
@RestController
public class TestClazz implements Test {
    @Override
    @RequestMapping("/getClazz")
    public Class getClazz() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new Class("一班",2017);
    }
}
