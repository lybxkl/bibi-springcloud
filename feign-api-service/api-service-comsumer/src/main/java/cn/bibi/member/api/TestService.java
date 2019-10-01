package cn.bibi.member.api;

import cn.bibi.member.entity.Student;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: ljobin
 * @description: 实体类可以放在api接口模块下面
 * @author: Mr.Liu
 * @create: 2019-10-01 21:54
 **/
public interface TestService {
    /**
     * 测试
     * @return
     */
    @RequestMapping("/getStudent")
    public Student getStudent();
}
