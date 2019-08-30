package com.vip.xiaomi.controller;

import com.vip.xiaomi.domain.entity.ShopCar;
import com.vip.xiaomi.service.ShopCarService;
import com.vip.xiaomi.utils.Result;
import org.apache.ibatis.annotations.Param;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author LFZicoo
 * @date 2019/8/29 15:10
 */
@RestController
@RequestMapping("/api")
public class ShopCarController {
     @Resource
     ShopCarService shopCarService;

     /**加入购物车*/
     @RequestMapping("/addShop")
     int addShopCar(int ShopId){
          int i = shopCarService.addShopCar(ShopId);
          return i;
     }

     /**通过用户id查询购物车*/
     @RequestMapping(value = "shopcar",params = "uid")
     public Result<List<ShopCar>> findShopCat(int uid){
          try {
               List<ShopCar> list = shopCarService.findByuid(uid);
               return Result.success(list);
          } catch (Exception e) {
               return Result.error();
          }
     }

     /**修改购物车信息
      * op  1减  2加
      * */
     @RequestMapping("/up")
     public Result uploadShop(@Param("shopId") int shopId,@Param("op") int op){
         try {
             int num = shopCarService.update(shopId, op);
             return Result.success(num);
         } catch (Exception e) {
             return Result.error();
         }
     }


}
