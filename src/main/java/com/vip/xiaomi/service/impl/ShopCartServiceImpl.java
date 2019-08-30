package com.vip.xiaomi.service.impl;

import com.vip.xiaomi.domain.entity.ShopCar;
import com.vip.xiaomi.mapper.ShopCarMapper;
import com.vip.xiaomi.service.ShopCarService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author LFZicoo
 * @date 2019/8/29 16:12
 */
@Service
public class ShopCartServiceImpl implements ShopCarService {
    @Resource
    ShopCarMapper shopCarMapper;

    @Override
    public int addShopCar(int ShopId) {
        int i = shopCarMapper.addShopCar(ShopId);
        return i;
    }

    @Override
    public List<ShopCar> findByuid(int uid) {

        return shopCarMapper.findByUid(uid);
    }

    @Override
    public int update(int shopId, int op) {
        int i = shopCarMapper.updateShopCar(shopId, op);
        return i;
    }
}
