package me.cchu.mall.coupon.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import me.cchu.mall.coupon.entity.CouponSpuCategoryRelationEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券分类关联
 * 
 */
@Mapper
public interface CouponSpuCategoryRelationDao extends BaseMapper<CouponSpuCategoryRelationEntity> {
	
}
