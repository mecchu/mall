package me.cchu.mall.ware.controller;

import me.cchu.common.utils.PageUtils;
import me.cchu.common.utils.R;
import me.cchu.mall.ware.entity.PurchaseEntity;
import me.cchu.mall.ware.service.PurchaseService;
import me.cchu.mall.ware.vo.MergeVo;
import me.cchu.mall.ware.vo.PurchaseDoneVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;


@RestController
@RequestMapping("ware/purchase")
public class PurchaseController {

    @Autowired
    private PurchaseService purchaseService;

	/**
	 * 完成采购单
	 */
	@PostMapping("/done")
	public R finish(@RequestBody PurchaseDoneVo doneVo){
		purchaseService.done(doneVo);

		return R.ok();
	}

	/**
	 * 领取采购单
	 */
	@PostMapping("/received")
	public R received(@RequestBody List<Long> ids){
		purchaseService.received(ids);

		return R.ok();
	}

	/**
	 * 合并采购单
	 */
    @PostMapping("/merge")
	public R merge(@RequestBody MergeVo mergeVo){
		purchaseService.mergePurchase(mergeVo);
		return R.ok();
	}
    /**
     * 列表
     */
    @RequestMapping("/unreceive/list")
    public R unreceive(@RequestParam Map<String, Object> params){
        PageUtils page = purchaseService.queryPageUnreceivePurchase(params);

        return R.ok().put("page", page);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("ware:purchase:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = purchaseService.queryPage(params);

        return R.ok().put("page", page);
    }

    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		PurchaseEntity purchase = purchaseService.getById(id);

        return R.ok().put("purchase", purchase);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody PurchaseEntity purchase){
		purchase.setUpdateTime(new Date());
		purchase.setCreateTime(new Date());
		purchaseService.save(purchase);
        return R.ok();
    }

    /**
     * 修改 分配人员
     */
    @RequestMapping("/update")
    public R update(@RequestBody PurchaseEntity purchase){
		purchaseService.updateById(purchase);
        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("${moduleNamez}:purchase:delete")
    public R delete(@RequestBody Long[] ids){
		purchaseService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
