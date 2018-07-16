package cn.tpson.springcloud.demo.ch10.controller;
import cn.tpson.springcloud.demo.ch10.service.Ch10Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * Created by Zhangka in 2018/07/13
 */
@RestController
@RequestMapping(value = "/api/demo")
public class Ch10Controller {
    private static final UUID INSTANCE_UUID = UUID.randomUUID();

    @Autowired
    DiscoveryClient discoveryClient;
    @Autowired
    Ch10Service ch10Service;

    @GetMapping(value = "/remote-instance")
    public String remoteInstance() {
        return this.ch10Service.instance();
    }

    @GetMapping(value = "/instance")
    public String instance() {
        for (String service : discoveryClient.getServices()) {
            System.out.println(service);

            for (ServiceInstance serviceId : discoveryClient.getInstances(service)) {
                System.out.println(serviceId.getUri());
            }
        }

        return INSTANCE_UUID.toString();
    }
}
