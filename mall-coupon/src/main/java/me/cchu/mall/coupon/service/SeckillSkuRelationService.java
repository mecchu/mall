package me.cchu.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import me.cchu.common.utils.PageUtils;
import me.cchu.mall.coupon.entity.SeckillSkuRelationEntity;

import java.util.Map;

/**
 * 秒杀活动商品关联
 *
 * @author cchu
 * @email cchu@cchu.me
 * @date 2021-04-11 16:25:02
 */
public interface SeckillSkuRelationService extends IService<SeckillSkuRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

