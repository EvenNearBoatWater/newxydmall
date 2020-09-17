package com.edu118.sale.dao;

import com.edu118.common.entity.sale.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author muyu
 * @email 1235767@qq.com
 * @date 2020-09-16 22:40:55
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
