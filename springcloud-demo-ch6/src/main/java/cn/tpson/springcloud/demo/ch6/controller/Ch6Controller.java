package cn.tpson.springcloud.demo.ch6.controller;

import cn.tpson.springcloud.demo.ch6.service.RemoteUserService;
import cn.tpson.springcloud.demo.common.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Zhangka in 2018/07/12
 */
@RestController
public class Ch6Controller {
    @Autowired
    RemoteUserService remoteUserService;

    @GetMapping("/ch6")
    public UserDTO ch6() {
        System.out.println("*******************ch6******************");
        return remoteUserService.getUserInfo();
    }
}
