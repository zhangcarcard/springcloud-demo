package cn.tpson.springcloud.demo.ch6.service;

import cn.tpson.springcloud.demo.common.dto.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Zhangka in 2018/07/13
 */
@FeignClient(value = "eureka8084")
public interface RemoteUserService {
    @GetMapping("/ch4")
    UserDTO getUserInfo();
}
