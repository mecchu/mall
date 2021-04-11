package me.cchu.mall.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import me.cchu.mall.coupon.entity.SeckillPromotionEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动
 * 
 */
@Mapper
public interface SeckillPromotionDao extends BaseMapper<SeckillPromotionEntity> {
	
}
