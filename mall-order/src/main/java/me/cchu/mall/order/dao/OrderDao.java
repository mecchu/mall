package me.cchu.mall.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import me.cchu.mall.order.entity.OrderEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * 订单
 * 
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {

	void updateOrderStatus(@Param("orderSn") String orderSn, @Param("code") Integer code);
}
