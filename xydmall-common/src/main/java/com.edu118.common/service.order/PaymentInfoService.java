package com.edu118.common.service.order;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu118.common.utils.PageUtils;
import com.edu118.common.entity.order.PaymentInfoEntity;

import java.util.Map;

/**
 * 支付信息表
 *
 * @author muyu
 * @email 1235767@qq.com
 * @date 2020-09-16 20:49:38
 */
public interface PaymentInfoService extends IService<PaymentInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

