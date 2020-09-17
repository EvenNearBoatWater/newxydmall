package com.edu118.common.service.order;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu118.common.utils.PageUtils;
import com.edu118.common.entity.order.OrderReturnApplyEntity;

import java.util.Map;

/**
 * 订单退货申请
 *
 * @author muyu
 * @email 1235767@qq.com
 * @date 2020-09-16 20:49:38
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

