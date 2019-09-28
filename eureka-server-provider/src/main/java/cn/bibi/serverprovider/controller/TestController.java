package cn.bibi.serverprovider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * @program: ljobin
 * @description:
 * @author: Mr.Liu
 * @create: 2019-09-28 17:41
 **/
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @GetMapping("/login2")
    public String login2( ModelAndView modelAndView){
        return "login2";
    }
}
