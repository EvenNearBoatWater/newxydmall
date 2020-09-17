package com.edu118.common.service.warehouse;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu118.common.utils.PageUtils;
import com.edu118.common.entity.warehouse.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author muyu
 * @email 1235767@qq.com
 * @date 2020-09-17 09:44:36
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

