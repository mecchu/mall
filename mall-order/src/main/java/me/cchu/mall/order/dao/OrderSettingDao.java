package me.cchu.mall.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import me.cchu.mall.order.entity.OrderSettingEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
