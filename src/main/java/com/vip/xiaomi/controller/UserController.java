package com.vip.xiaomi.controller;

import com.vip.xiaomi.service.UserService;
import com.vip.xiaomi.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author LFZicoo
 * @date 2019/8/28 19:44
 */
@RestController
@RequestMapping("/api")
public class UserController {
    @Resource
    UserService userService;

    /**用户登录*/
//    @PostMapping("/login")
    @RequestMapping("/login")
    public Result login(String username,String password){
        try {
            Result result = userService.login(username, password);
            return result;
        } catch (Exception e) {
            return Result.error();
        }
    }

    /**用户注册*/
    @RequestMapping("/regist")
    public Result regist(String username,String password){
        try {
            Result result = userService.regist(username, password);
            return result;
        } catch (Exception e) {
            return Result.error();
        }
    }
}
