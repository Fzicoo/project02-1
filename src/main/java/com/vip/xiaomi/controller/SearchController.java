package com.vip.xiaomi.controller;

import com.vip.xiaomi.domain.entity.Shop;
import com.vip.xiaomi.service.SearchService;
import com.vip.xiaomi.utils.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author LFZicoo
 * @date 2019/8/28 19:19
 */
@RestController
@RequestMapping("/api")
public class SearchController {
    @Resource
    SearchService searchService;

    /**根据关键字模糊查询商品*/
    @RequestMapping("/search")
    public Result<List<Shop>> search(String keyword){
        try {
            List<Shop> shopList = searchService.search(keyword);
            return Result.success(shopList);
        } catch (Exception e) {
            return Result.error();
        }
    }
}
