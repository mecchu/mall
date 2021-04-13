package me.cchu.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import me.cchu.common.utils.PageUtils;
import me.cchu.mall.coupon.entity.CouponHistoryEntity;

import java.util.Map;

/**
 * 优惠券领取历史记录
 *
 * @author cchu
 * @email cchu@cchu.me
 * @date 2021-04-11 16:25:02
 */
public interface CouponHistoryService extends IService<CouponHistoryEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

