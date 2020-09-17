package com.edu118.common.service.commodity;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu118.common.utils.PageUtils;
import com.edu118.common.entity.commodity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author muyu
 * @email 1235767@qq.com
 * @date 2020-09-16 21:58:42
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

