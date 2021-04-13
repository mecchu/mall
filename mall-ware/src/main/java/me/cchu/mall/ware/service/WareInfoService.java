package me.cchu.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import me.cchu.common.utils.PageUtils;
import me.cchu.mall.ware.entity.WareInfoEntity;
import me.cchu.mall.ware.vo.FareVo;

import java.util.Map;

public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

	/**
	 * 根据收获地址计算运费
	 */
	FareVo getFare(Long addrId);
}

