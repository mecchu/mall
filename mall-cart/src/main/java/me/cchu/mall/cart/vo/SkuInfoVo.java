package me.cchu.mall.cart.vo;

import lombok.Data;

import java.math.BigDecimal;

/**
 * <p>Title: SkuInfoVo</p>
 * Description：用于封装远程返回的Sku对象
<<<<<<< HEAD
=======
 * date：2020/6/28 11:33
>>>>>>> ca0ed446bf0eb3e65dd4b881427e2993d04a31f6
 */
@Data
public class SkuInfoVo {

	private Long skuId;
	/**
	 * spuId
	 */
	private Long spuId;
	/**
	 * sku名称
	 */
	private String skuName;
	/**
	 * sku介绍描述
	 */
	private String skuDesc;
	/**
	 * 所属分类id
	 */
	private Long catalogId;
	/**
	 * 品牌id
	 */
	private Long brandId;
	/**
	 * 默认图片
	 */
	private String skuDefaultImg;
	/**
	 * 标题
	 */
	private String skuTitle;
	/**
	 * 副标题
	 */
	private String skuSubtitle;
	/**
	 * 价格
	 */
	private BigDecimal price;
	/**
	 * 销量
	 */
	private Long saleCount;
}