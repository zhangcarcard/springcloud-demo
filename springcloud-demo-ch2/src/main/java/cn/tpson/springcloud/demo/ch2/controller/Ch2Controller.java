package cn.tpson.springcloud.demo.ch2.controller;

import cn.tpson.springcloud.demo.common.dto.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


/**
 * Created by Zhangka in 2018/07/11
 */
@RestController
public class Ch2Controller {
    private static final Logger log = LoggerFactory.getLogger(Ch2Controller.class);
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/ch2")
    public UserDTO test() {
        UserDTO user = restTemplate.getForObject("http://192.168.1.249:8081/springcloud-demo-ch1/ch1", UserDTO.class);
        return user;
    }
}
