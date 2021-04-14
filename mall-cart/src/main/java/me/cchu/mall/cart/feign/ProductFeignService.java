package me.cchu.mall.cart.feign;

<<<<<<< HEAD
import  me.cchu.common.utils.R;
=======
import com.firenay.common.utils.R;
>>>>>>> ca0ed446bf0eb3e65dd4b881427e2993d04a31f6
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * <p>Title: ProductFeignService</p>
 * Description：
<<<<<<< HEAD
=======
 * date：2020/6/28 11:29
>>>>>>> ca0ed446bf0eb3e65dd4b881427e2993d04a31f6
 */
@FeignClient("mall-product")
public interface ProductFeignService {

	@RequestMapping("/product/skuinfo/info/{skuId}")
	R SkuInfo(@PathVariable("skuId") Long skuId);

	@GetMapping("/product/skusaleattrvalue/stringlist/{skuId}")
	List<String> getSkuSaleAttrValues(@PathVariable("skuId") Long skuId);

	@GetMapping("/product/skuinfo/{skuId}/price")
	R getPrice(@PathVariable("skuId") Long skuId);
}
