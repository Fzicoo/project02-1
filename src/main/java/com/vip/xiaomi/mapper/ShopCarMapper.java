package com.vip.xiaomi.mapper;

import com.vip.xiaomi.domain.entity.ShopCar;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author LFZicoo
* @date 2019/8/29 15:32
*/
public interface ShopCarMapper {
    /**加入购物车*/
    int addShopCar(@Param("ShopId") int ShopId);

    /**根据用户id查询购物车*/
    List<ShopCar> findByUid(@Param("uid") int uid);

    /**修改购物车商品
     * op  1加  2减
     * */
    int updateShopCar(@Param("shopId") int shopId,@Param("op") int op);

    /**查看购物车信息*/
    List<ShopCar> findShopCat();
}