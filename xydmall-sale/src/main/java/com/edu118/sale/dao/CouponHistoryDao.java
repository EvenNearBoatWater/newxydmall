package com.edu118.sale.dao;

import com.edu118.common.entity.sale.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author muyu
 * @email 1235767@qq.com
 * @date 2020-09-16 22:40:55
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
