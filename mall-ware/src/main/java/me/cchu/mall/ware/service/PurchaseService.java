package me.cchu.mall.ware.service;


import com.baomidou.mybatisplus.extension.service.IService;
import me.cchu.common.utils.PageUtils;
import me.cchu.mall.ware.entity.PurchaseEntity;
import me.cchu.mall.ware.vo.MergeVo;
import me.cchu.mall.ware.vo.PurchaseDoneVo;

import java.util.List;
import java.util.Map;

public interface PurchaseService extends IService<PurchaseEntity> {

    PageUtils queryPage(Map<String, Object> params);

	PageUtils queryPageUnreceivePurchase(Map<String, Object> params);

	void mergePurchase(MergeVo mergeVo);

	void received(List<Long> ids);

	void done(PurchaseDoneVo doneVo);
}

