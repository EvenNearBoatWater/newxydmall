package com.edu118.common.service.member;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu118.common.utils.PageUtils;
import com.edu118.common.entity.member.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author muyu
 * @email 1235767@qq.com
 * @date 2020-09-17 09:19:56
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

