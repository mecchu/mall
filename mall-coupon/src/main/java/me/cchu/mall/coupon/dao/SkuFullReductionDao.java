package me.cchu.mall.coupon.dao;

import me.cchu.mall.coupon.entity.SkuFullReductionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品满减信息
 * 
 * @author cchu
 * @email cchu@cchu.me
 * @date 2021-04-11 16:25:02
 */
@Mapper
public interface SkuFullReductionDao extends BaseMapper<SkuFullReductionEntity> {
	
}
