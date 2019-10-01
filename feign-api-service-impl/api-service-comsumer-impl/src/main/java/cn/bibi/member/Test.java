package cn.bibi.member;

import cn.bibi.feign.FeignTest;
import cn.bibi.member.api.TestService;
import cn.bibi.member.entity.Student;
import cn.bibi.order.entity.Class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: ljobin
 * @description: \
 * @author: Mr.Liu
 * @create: 2019-10-01 23:08
 **/
@RestController
public class Test implements TestService {
    @Autowired
    FeignTest feignTest;
    @Override
    @RequestMapping("/getStudent")
    public Student getStudent() {
        Class clazz = feignTest.getClazz();
        return new Student("刘衍斌在"+clazz.getClassName()+",班号："+clazz.getClassId(),21);
    }
}
