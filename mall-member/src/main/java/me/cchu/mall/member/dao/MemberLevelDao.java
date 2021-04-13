package me.cchu.mall.member.dao;

import me.cchu.mall.member.entity.MemberLevelEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员等级
 * 
 * @author cchu
 * @email cchu@cchu.me
 * @date 2021-04-11 16:41:03
 */
@Mapper
public interface MemberLevelDao extends BaseMapper<MemberLevelEntity> {
	
}
