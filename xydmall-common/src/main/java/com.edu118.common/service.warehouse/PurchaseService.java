package com.edu118.common.service.warehouse;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu118.common.utils.PageUtils;
import com.edu118.common.entity.warehouse.PurchaseEntity;

import java.util.Map;

/**
 * 采购信息
 *
 * @author muyu
 * @email 1235767@qq.com
 * @date 2020-09-17 09:44:35
 */
public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

