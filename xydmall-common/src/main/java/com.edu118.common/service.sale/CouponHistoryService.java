package com.edu118.common.service.sale;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu118.common.entity.sale.CouponHistoryEntity;
import com.edu118.common.utils.PageUtils;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author muyu
 * @email 1235767@qq.com
 * @date 2020-09-16 22:40:55
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

