package me.cchu.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import me.cchu.common.utils.PageUtils;
import me.cchu.mall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author cchu
 * @email cchu@cchu.me
 * @date 2021-04-11 16:47:59
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

