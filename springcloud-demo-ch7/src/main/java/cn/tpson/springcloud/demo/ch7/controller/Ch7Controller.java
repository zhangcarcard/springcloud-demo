package cn.tpson.springcloud.demo.ch7.controller;

import cn.tpson.springcloud.demo.ch7.service.RemoteUserService;
import cn.tpson.springcloud.demo.common.dto.UserDTO;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Zhangka in 2018/07/13
 */
@RestController
public class Ch7Controller {
    @Autowired
    RemoteUserService remoteUserService;

    @GetMapping("/ch7")
    public UserDTO ch7() {
        System.out.println("*******************ch7******************");
        return remoteUserService.getUserInfo();
    }
}
