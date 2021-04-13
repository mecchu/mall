package me.cchu.mall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import me.cchu.common.to.mq.SeckillOrderTo;
import me.cchu.common.utils.PageUtils;
import me.cchu.mall.order.entity.OrderEntity;
import me.cchu.mall.order.vo.*;
import org.apache.ibatis.annotations.Param;

import java.util.Map;
import java.util.concurrent.ExecutionException;

/**
 * 订单
 *
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);

	/**
	 * 给订单确认页返回需要的数据
	 */
	OrderConfirmVo confirmOrder() throws ExecutionException, InterruptedException;

	/**
	 * 下单操作
	 */
	SubmitOrderResponseVo submitOrder(OrderSubmitVo submitVo);

	OrderEntity getOrderByOrderSn(String orderSn);

	void closeOrder(OrderEntity entity);

	/**
	 * 获取当前订单的支付信息
	 */
	PayVo getOrderPay(String orderSn);

	PageUtils queryPageWithItem(@Param("params") Map<String, Object> params);

	/**
	 * 处理支付宝的返回数据
	 */
	String handlePayResult(PayAsyncVo vo);

	void createSecKillOrder(SeckillOrderTo secKillOrderTo);
}

