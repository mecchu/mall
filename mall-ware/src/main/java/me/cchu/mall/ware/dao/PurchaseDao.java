package me.cchu.mall.ware.dao;

import me.cchu.mall.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author cchu
 * @email cchu@cchu.me
 * @date 2021-04-11 16:47:59
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
