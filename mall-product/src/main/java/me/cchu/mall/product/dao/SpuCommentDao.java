package me.cchu.mall.product.dao;

import me.cchu.mall.product.entity.SpuCommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author cchu
 * @email cchu@cchu.me
 * @date 2021-04-11 15:15:31
 */
@Mapper
public interface SpuCommentDao extends BaseMapper<SpuCommentEntity> {
	
}
