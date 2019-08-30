package com.vip.xiaomi.service.impl;

import com.vip.xiaomi.domain.entity.Shop;
import com.vip.xiaomi.mapper.ShopMapper;
import com.vip.xiaomi.service.SearchService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author LFZicoo
 * @date 2019/8/28 21:48
 */
@Service
public class SearchServiceImpl implements SearchService {
    @Resource
    ShopMapper shopMapper;
    @Override
    public List<Shop> search(String kw) {
        List<Shop> shopList = shopMapper.findBykw(kw);
        return shopList;
    }
}
