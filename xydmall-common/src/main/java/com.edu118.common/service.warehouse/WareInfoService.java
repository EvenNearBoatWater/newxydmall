package com.edu118.common.service.warehouse;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu118.common.utils.PageUtils;
import com.edu118.common.entity.warehouse.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author muyu
 * @email 1235767@qq.com
 * @date 2020-09-17 09:44:36
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

