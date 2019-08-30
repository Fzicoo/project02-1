package com.vip.xiaomi.service.impl;

import com.vip.xiaomi.domain.entity.User;
import com.vip.xiaomi.mapper.UserMapper;
import com.vip.xiaomi.service.UserService;
import com.vip.xiaomi.utils.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author LFZicoo
 * @date 2019/8/28 19:21
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public Result login(String username, String password) {
        Result result = new Result();
        User user = userMapper.login(username);
        if (user != null){
            if (user.getPassword().equals(password)){
                result.setData(user);
            }else {
                //1表示密码错误
                result.setStatus(1);
            }
        }else {
            //2表示用户名不存在
            result.setStatus(2);
        }
        return result;
    }

    @Override
    public Result regist(String username, String password) {
        Result result = new Result();
        User user = userMapper.login(username);
        if (user != null){
            //1表示用户已存在
            result.setData(user);
            result.setStatus(1);
        }else {
            boolean b = userMapper.regist(username, password);
            result.setData(b);
        }

        return result;
    }
}
