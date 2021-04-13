package me.cchu.mall.ware.service;


import com.baomidou.mybatisplus.extension.service.IService;
import me.cchu.common.utils.PageUtils;
import me.cchu.mall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);

	WareOrderTaskEntity getOrderTaskByOrderSn(String orderSn);
}

