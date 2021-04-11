package me.cchu.mall.ware.dao;

import me.cchu.mall.ware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author cchu
 * @email cchu@cchu.me
 * @date 2021-04-11 16:47:59
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
