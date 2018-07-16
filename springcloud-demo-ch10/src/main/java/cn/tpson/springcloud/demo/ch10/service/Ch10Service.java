package cn.tpson.springcloud.demo.ch10.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by Zhangka in 2018/07/16
 */
@FeignClient(value = "zoo-service", path = "/api/demo")
public interface Ch10Service {
    @GetMapping(value = "/instance")
    String instance();
}
