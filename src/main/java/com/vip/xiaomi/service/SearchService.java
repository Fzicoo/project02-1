package com.vip.xiaomi.service;

import com.vip.xiaomi.domain.entity.Shop;

import java.util.List;

/**
 * @author LFZicoo
 * @date 2019/8/28 21:44
 */
public interface SearchService {
    List<Shop> search(String kw);
}
