package me.cchu.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import me.cchu.common.utils.PageUtils;
import me.cchu.mall.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author cchu
 * @email cchu@cchu.me
 * @date 2021-04-11 16:41:03
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

