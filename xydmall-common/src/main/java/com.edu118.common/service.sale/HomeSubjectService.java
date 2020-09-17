package com.edu118.common.service.sale;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu118.common.utils.PageUtils;
import com.edu118.common.entity.sale.HomeSubjectEntity;

import java.util.Map;

/**
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】
 *
 * @author muyu
 * @email 1235767@qq.com
 * @date 2020-09-16 22:40:55
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

