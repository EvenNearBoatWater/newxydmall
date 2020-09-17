package com.edu118.common.service.warehouse;

import com.baomidou.mybatisplus.extension.service.IService;
import com.edu118.common.utils.PageUtils;
import com.edu118.common.entity.warehouse.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author muyu
 * @email 1235767@qq.com
 * @date 2020-09-17 09:44:36
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

