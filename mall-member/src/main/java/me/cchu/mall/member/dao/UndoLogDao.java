package me.cchu.mall.member.dao;

import me.cchu.mall.member.entity.UndoLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author cchu
 * @email cchu@cchu.me
 * @date 2021-04-11 16:41:03
 */
@Mapper
public interface UndoLogDao extends BaseMapper<UndoLogEntity> {
	
}
