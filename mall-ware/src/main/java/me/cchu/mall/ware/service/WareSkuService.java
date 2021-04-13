package me.cchu.mall.ware.service;


import com.baomidou.mybatisplus.extension.service.IService;
import me.cchu.common.to.OrderTo;
import me.cchu.common.to.SkuHasStockVo;
import me.cchu.common.to.mq.StockLockedTo;
import me.cchu.common.utils.PageUtils;
import me.cchu.mall.ware.entity.WareSkuEntity;
import me.cchu.mall.ware.vo.WareSkuLockVo;

import java.util.List;
import java.util.Map;

public interface WareSkuService extends IService<WareSkuEntity> {

	void unlockStock(StockLockedTo to);

	PageUtils queryPage(Map<String, Object> params);

	/**
	 * 保存库存的时候顺便查到商品价格
	 */
	double addStock(Long skuId, Long wareId, Integer skuNum);

	/**
	 * 查询是否有库存
	 */
	List<SkuHasStockVo> getSkuHasStock(List<Long> skuIds);

	/**
	 * 为某个订单锁定库存
	 */
	Boolean orderLockStock(WareSkuLockVo vo);

	/**
	 * 由于订单超时而自动释放订单之后来解锁库存
	 */
	void unlockStock(OrderTo to);
}

