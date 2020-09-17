package com.edu118.order.dao;

import com.edu118.common.entity.order.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author muyu
 * @email 1235767@qq.com
 * @date 2020-09-16 20:49:38
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
