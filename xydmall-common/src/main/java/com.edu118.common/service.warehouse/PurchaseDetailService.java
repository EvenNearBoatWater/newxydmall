package com.edu118.common.service.warehouse;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu118.common.entity.warehouse.PurchaseDetailEntity;
import com.edu118.common.utils.PageUtils;

import java.util.Map;

/**
 * 采购明细
 *
 * @author muyu
 * @email 1235767@qq.com
 * @date 2020-09-17 09:44:36
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

