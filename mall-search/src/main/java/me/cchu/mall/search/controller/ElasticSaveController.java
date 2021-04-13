package me.cchu.mall.search.controller;

import me.cchu.common.utils.R;
import me.cchu.mall.search.service.ProductSaveService;
import lombok.extern.slf4j.Slf4j;
import me.cchu.common.exception.BizCodeEnum;
import me.cchu.common.to.es.SkuEsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;


@Slf4j
@RequestMapping("/search/save")
@RestController
public class ElasticSaveController {

	@Autowired
	private ProductSaveService productSaveService;

	/**
	 * 上架商品
	 */
	@PostMapping("/product")
	public R productStatusUp(@RequestBody List<SkuEsModel> skuEsModels){

		boolean status;
		try {
			status = productSaveService.productStatusUp(skuEsModels);
		} catch (IOException e) {
			log.error("ElasticSaveController商品上架错误: {}", e);
			return R.error(BizCodeEnum.PRODUCT_UP_EXCEPTION.getCode(), BizCodeEnum.PRODUCT_UP_EXCEPTION.getMsg());
		}
		if(!status){
			return R.ok();
		}
		return R.error(BizCodeEnum.PRODUCT_UP_EXCEPTION.getCode(), BizCodeEnum.PRODUCT_UP_EXCEPTION.getMsg());
	}
}
