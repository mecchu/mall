package me.cchu.mall.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import me.cchu.mall.coupon.entity.SeckillSkuNoticeEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀商品通知订阅
 * 
 */
@Mapper
public interface SeckillSkuNoticeDao extends BaseMapper<SeckillSkuNoticeEntity> {
	
}
