package cn.tpson.springcloud.demo.ch9.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Zhangka in 2018/07/13
 */
@RestController
@RequestMapping(value = "/api/demo")
public class Ch9Controller {

    @GetMapping(value = "/instance")
    public String instance() {
        Long time = System.currentTimeMillis();
        System.out.println(time);
        return time.toString();
    }
}
