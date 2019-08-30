package com.vip.xiaomi.service;

import com.vip.xiaomi.domain.entity.User;
import com.vip.xiaomi.utils.Result;

/**
 * @author LFZicoo
 * @date 2019/8/28 19:16
 */
public interface UserService {
    Result login(String username, String password);

    Result regist(String username, String password);
}
