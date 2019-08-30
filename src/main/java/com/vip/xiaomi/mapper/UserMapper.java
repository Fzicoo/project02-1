package com.vip.xiaomi.mapper;

import com.vip.xiaomi.domain.entity.User;
import org.apache.ibatis.annotations.Param;

/**
* @author LFZicoo
* @date 2019/8/28 19:06
*/
public interface UserMapper {
    User login(@Param("name") String username);

    boolean regist(@Param("username") String username,@Param("password") String password);
}