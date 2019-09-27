package cn.bibi.serverconsumer.controller;

import cn.bibi.serverconsumer.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: ljobin
 * @description:
 * @author: Mr.Liu
 * @create: 2019-09-27 19:35
 **/
@RestController
public class HiController {
    @Autowired
    private HiService hiService;
    @RequestMapping("/hi")
    public String getData(@RequestParam(value = "name", defaultValue = "forezp") String name){
        return hiService.getData(name);
    }
}
