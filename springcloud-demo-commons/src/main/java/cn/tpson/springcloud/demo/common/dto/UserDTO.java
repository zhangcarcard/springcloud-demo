package cn.tpson.springcloud.demo.common.dto;

import java.io.Serializable;

/**
 * Created by Zhangka in 2018/07/11
 */
public class UserDTO implements Serializable {
    public UserDTO() {}
    public UserDTO(String username, Integer age) {
        this.username = username;
        this.age = age;
    }

    private String username;
    private Integer age;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
