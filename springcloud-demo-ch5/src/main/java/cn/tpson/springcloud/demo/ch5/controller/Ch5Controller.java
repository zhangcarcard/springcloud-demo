package cn.tpson.springcloud.demo.ch5.controller;

import cn.tpson.springcloud.demo.common.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by Zhangka in 2018/07/12
 */
@RestController
public class Ch5Controller {
    @Autowired
    DiscoveryClient discoveryClient;
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/ch5")
    public UserDTO ch5() {
        /*List<String> services = discoveryClient.getServices();
        for (String service : services) {
            System.out.println(service);
        }

        System.out.println("=======================================");
        List<ServiceInstance> list = discoveryClient.getInstances("HHH");
        if (list != null && list.size() > 0 ) {
            System.out.println(list.get(0).getUri());
        }*/

        System.out.println("************************ch5***********************************");
        return restTemplate.getForObject("http://eureka8084/ch4", UserDTO.class);
    }
}
