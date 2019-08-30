package com.vip.xiaomi.service;

import com.vip.xiaomi.domain.entity.ShopCar;

import java.util.List;

/**
 * @author LFZicoo
 * @date 2019/8/29 16:11
 */
public interface ShopCarService {
    /**加入购物车*/
    int addShopCar(int ShopId);

    /**根据用户id查询购物车商品信息*/
    List<ShopCar> findByuid(int uid);

    /**修改购物车
     * op 1增 2减
     * */
    int update(int shopId,int op);
}
