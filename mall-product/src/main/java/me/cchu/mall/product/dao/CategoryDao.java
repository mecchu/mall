package me.cchu.mall.product.dao;

import me.cchu.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author cchu
 * @email cchu@cchu.me
 * @date 2021-04-11 15:15:32
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
