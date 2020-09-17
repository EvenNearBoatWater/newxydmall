package com.edu118.common.service.sale;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu118.common.utils.PageUtils;
import com.edu118.common.entity.sale.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author muyu
 * @email 1235767@qq.com
 * @date 2020-09-16 22:40:55
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

