package me.cchu.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import me.cchu.common.utils.PageUtils;
import me.cchu.mall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author cchu
 * @email cchu@cchu.me
 * @date 2021-04-11 15:15:32
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void updateDetail(BrandEntity brand);
}


