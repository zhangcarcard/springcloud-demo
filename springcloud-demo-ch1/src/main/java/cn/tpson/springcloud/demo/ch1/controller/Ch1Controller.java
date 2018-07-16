package cn.tpson.springcloud.demo.ch1.controller;

import cn.tpson.springcloud.demo.common.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Zhangka in 2018/07/11
 */
@RestController
public class Ch1Controller {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/ch1")
    public UserDTO ch1() {
        return new UserDTO("ch1", 1);
    }
}
