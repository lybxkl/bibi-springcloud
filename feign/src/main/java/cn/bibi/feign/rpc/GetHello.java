package cn.bibi.feign.rpc;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "service-provider")
public interface GetHello {
    @RequestMapping(value = "/hi?name=feign",method = RequestMethod.GET)
    public String home();
}
