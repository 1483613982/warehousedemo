package com.xiaolei.warehousedemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private int id;  //用户Id
    private String username;   // 用户名
    private String password; // 密码
    private String create_time; // 创建时间
    private String update_time; // 更新时间
    private String avatar; //用户头像
    private String rank; //用户权限

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
