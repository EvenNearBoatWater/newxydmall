package com.edu118.common.service.commodity;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu118.common.utils.PageUtils;
import com.edu118.common.entity.commodity.CategoryEntity;

import java.util.Map;

/**
 * 商品三级分类
 *
 * @author muyu
 * @email 1235767@qq.com
 * @date 2020-09-16 21:58:42
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

