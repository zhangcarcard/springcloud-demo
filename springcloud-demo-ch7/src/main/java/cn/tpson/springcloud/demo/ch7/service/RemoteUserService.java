package cn.tpson.springcloud.demo.ch7.service;

import cn.tpson.springcloud.demo.common.dto.UserDTO;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Zhangka in 2018/07/13
 */
@FeignClient(value = "user", fallback = RemoteUserServiceHystrix.class)
public interface RemoteUserService {
    @GetMapping("/ch4")
    UserDTO getUserInfo();
}
