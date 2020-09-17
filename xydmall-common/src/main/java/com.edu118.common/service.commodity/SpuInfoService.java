package com.edu118.common.service.commodity;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu118.common.utils.PageUtils;
import com.edu118.common.entity.commodity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author muyu
 * @email 1235767@qq.com
 * @date 2020-09-16 21:58:41
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

