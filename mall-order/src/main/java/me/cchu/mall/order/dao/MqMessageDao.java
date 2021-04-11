package me.cchu.mall.order.dao;

import me.cchu.mall.order.entity.MqMessageEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author cchu
 * @email cchu@cchu.me
 * @date 2021-04-11 15:19:05
 */
@Mapper
public interface MqMessageDao extends BaseMapper<MqMessageEntity> {
	
}
