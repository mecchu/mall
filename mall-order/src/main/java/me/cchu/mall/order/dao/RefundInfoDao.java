package me.cchu.mall.order.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import me.cchu.mall.order.entity.RefundInfoEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 退款信息
 * 
 */
@Mapper
public interface RefundInfoDao extends BaseMapper<RefundInfoEntity> {
	
}
