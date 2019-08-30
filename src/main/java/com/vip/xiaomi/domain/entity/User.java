package com.vip.xiaomi.domain.entity;

import java.util.Date;
import lombok.Data;

/**
* @author LFZicoo
* @date 2019/8/28 19:06
*/
@Data
public class User {
    private Integer uid;

    private String username;

    private String password;

    private Date lastLogin;

    private String icon;

    private Date creatDate;

    private Integer status;

    private String email;
}