package me.cchu.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import me.cchu.common.utils.PageUtils;
import me.cchu.mall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author cchu
 * @email cchu@cchu.me
 * @date 2021-04-11 16:41:03
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

