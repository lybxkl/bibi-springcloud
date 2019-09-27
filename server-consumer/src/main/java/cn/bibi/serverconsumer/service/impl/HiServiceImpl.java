package cn.bibi.serverconsumer.service.impl;

import cn.bibi.serverconsumer.service.HiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @program: ljobin
 * @description:
 * @author: Mr.Liu
 * @create: 2019-09-27 19:27
 **/
@Service
public class HiServiceImpl implements HiService {
    @Autowired
    RestTemplate restTemplate;
    @Override
    public String getData(String name) {
        //有两种方式调用，一种是访问别名调用（就是下面的），还有就是直接调用（ip）
        return name+"： 你好呀！同志，\r\n"+restTemplate.getForObject("http://service-provider/hi?name=" + name, String.class);
    }
}
