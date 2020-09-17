package com.edu118.warehouse.dao;

import com.edu118.common.entity.warehouse.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author muyu
 * @email 1235767@qq.com
 * @date 2020-09-17 09:44:36
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
