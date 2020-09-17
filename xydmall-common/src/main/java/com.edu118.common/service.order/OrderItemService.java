package com.edu118.common.service.order;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu118.common.entity.order.OrderItemEntity;
import com.edu118.common.utils.PageUtils;
import com.edu118.common.entity.order.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author muyu
 * @email 1235767@qq.com
 * @date 2020-09-16 20:49:38
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

