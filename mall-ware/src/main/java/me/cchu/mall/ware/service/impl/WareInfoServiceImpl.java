package me.cchu.mall.ware.service.impl;


import com.alibaba.fastjson.TypeReference;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import me.cchu.common.utils.PageUtils;
import me.cchu.common.utils.Query;
import me.cchu.common.utils.R;
import me.cchu.mall.ware.dao.WareInfoDao;
import me.cchu.mall.ware.entity.WareInfoEntity;
import me.cchu.mall.ware.feign.MemberFeignService;
import me.cchu.mall.ware.service.WareInfoService;
import me.cchu.mall.ware.vo.FareVo;
import me.cchu.mall.ware.vo.MemberAddressVo;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Map;
import java.util.Random;

@Service("wareInfoService")
public class WareInfoServiceImpl extends ServiceImpl<WareInfoDao, WareInfoEntity> implements WareInfoService {

	@Autowired
	private MemberFeignService memberFeignService;

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
		QueryWrapper<WareInfoEntity> wrapper = new QueryWrapper<>();

		String key = (String) params.get("key");
		if(!StringUtils.isEmpty(key)){
			wrapper.eq("id", key).or().like("name",key).or().like("address", key).or().like("areacode", key);
		}
		IPage<WareInfoEntity> page = this.page(
                new Query<WareInfoEntity>().getPage(params),
				wrapper
        );
        return new PageUtils(page);
    }

	@Override
	public FareVo getFare(Long addrId) {

		R info = memberFeignService.addrInfo(addrId);
		FareVo fareVo = new FareVo();
		MemberAddressVo addressVo = info.getData("memberReceiveAddress", new TypeReference<MemberAddressVo>() {});
		fareVo.setMemberAddressVo(addressVo);
		if(addressVo != null){
			String phone = addressVo.getPhone();
			if(phone == null || phone.length() < 2){
				phone = new Random().nextInt(100) + "";
			}
			BigDecimal decimal = new BigDecimal(phone.substring(phone.length() - 1));
			fareVo.setFare(decimal);
		}else{
			fareVo.setFare(new BigDecimal("20"));
		}
		return fareVo;
	}
}