package me.cchu.mall.order.vo;

import lombok.Data;
import me.cchu.mall.order.entity.OrderEntity;


@Data
public class SubmitOrderResponseVo {

	private OrderEntity orderEntity;

	/**
	 * 错误状态码： 0----成功
	 */
	private Integer code;
}
