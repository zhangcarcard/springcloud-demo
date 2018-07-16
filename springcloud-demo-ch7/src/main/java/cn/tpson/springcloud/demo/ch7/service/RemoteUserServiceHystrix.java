package cn.tpson.springcloud.demo.ch7.service;

import cn.tpson.springcloud.demo.common.dto.UserDTO;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by Zhangka in 2018/07/13
 */
@Component
public class RemoteUserServiceHystrix implements RemoteUserService {
    @Override
    public UserDTO getUserInfo() {
        return new UserDTO("error", -11);
    }
}
