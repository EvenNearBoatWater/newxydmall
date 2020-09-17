package com.edu118.member.dao;

import com.edu118.common.entity.member.MemberLoginLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 * 
 * @author muyu
 * @email 1235767@qq.com
 * @date 2020-09-17 09:19:56
 */
@Mapper
public interface MemberLoginLogDao extends BaseMapper<MemberLoginLogEntity> {
	
}
