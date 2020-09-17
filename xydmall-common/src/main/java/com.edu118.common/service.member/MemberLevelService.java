package com.edu118.common.service.member;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu118.common.utils.PageUtils;
import com.edu118.common.entity.member.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author muyu
 * @email 1235767@qq.com
 * @date 2020-09-17 09:19:56
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

