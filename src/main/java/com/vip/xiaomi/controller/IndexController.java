package com.vip.xiaomi.controller;

import com.vip.xiaomi.service.IndexService;
import com.vip.xiaomi.utils.CateBean;
import com.vip.xiaomi.utils.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author LFZicoo
 * @date 2019/8/26 23:46
 */
@RestController
@RequestMapping("/api")
public class IndexController {
    @Resource
    IndexService indexService;

    /**导航栏*/
    @GetMapping("/heads")
    public Result getHeaderData(){
        try {
            CateBean header = indexService.getHeader();
            return Result.success(header);
        } catch (Exception e) {
            return Result.error();
        }
    }

//    导航栏下拉菜单
    @GetMapping("/menus")
    public Result getSubMenu(){
        try {
            CateBean subMenu = indexService.getSubMenu();
            return Result.success(subMenu);
        } catch (Exception e) {
            return Result.error();
        }
    }
}
