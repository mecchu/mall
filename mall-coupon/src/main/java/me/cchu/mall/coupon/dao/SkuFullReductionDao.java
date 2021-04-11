package me.cchu.mall.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import me.cchu.mall.coupon.entity.SkuFullReductionEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品满减信息
 * 
 */
@Mapper
public interface SkuFullReductionDao extends BaseMapper<SkuFullReductionEntity> {
	
}
