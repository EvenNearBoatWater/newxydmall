package com.edu118.common.service.commodity;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu118.common.utils.PageUtils;
import com.edu118.common.entity.commodity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author muyu
 * @email 1235767@qq.com
 * @date 2020-09-16 21:58:42
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

