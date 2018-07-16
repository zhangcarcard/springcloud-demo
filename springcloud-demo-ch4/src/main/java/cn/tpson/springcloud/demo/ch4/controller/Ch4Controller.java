package cn.tpson.springcloud.demo.ch4.controller;

import cn.tpson.springcloud.demo.common.dto.UserDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Zhangka in 2018/07/13
 */
@RestController
public class Ch4Controller {
    private static final Logger log = LoggerFactory.getLogger(Ch4Controller.class);

    @GetMapping("/ch4")
    public UserDTO ch4() {
        log.info("node2");
        return new UserDTO("ch4", 4);
    }
}
