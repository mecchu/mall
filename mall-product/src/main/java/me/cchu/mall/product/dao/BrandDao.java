package me.cchu.mall.product.dao;

import me.cchu.mall.product.entity.BrandEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌
 * 
 * @author cchu
 * @email cchu@cchu.me
 * @date 2021-04-11 15:15:32
 */
@Mapper
public interface BrandDao extends BaseMapper<BrandEntity> {
	
}
