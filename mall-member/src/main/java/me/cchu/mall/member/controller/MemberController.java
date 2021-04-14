package me.cchu.mall.member.controller;

import java.util.Arrays;
import java.util.Map;

import me.cchu.mall.member.feign.CouponFeignService;
import org.springframework.beans.factory.annotation.Autowired;
<<<<<<< HEAD
=======
import org.springframework.context.annotation.Lazy;
>>>>>>> ca0ed446bf0eb3e65dd4b881427e2993d04a31f6
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import me.cchu.mall.member.entity.MemberEntity;
import me.cchu.mall.member.service.MemberService;
import me.cchu.common.utils.PageUtils;
import me.cchu.common.utils.R;

import javax.annotation.Resource;


/**
 * 会员
 *
 * @author cchu
 * @email cchu@cchu.me
 * @date 2021-04-11 16:41:03
 */
@RestController
@RequestMapping("member/member")
public class MemberController {

    @Autowired
    private MemberService memberService;

<<<<<<< HEAD
=======
    @Lazy
>>>>>>> ca0ed446bf0eb3e65dd4b881427e2993d04a31f6
    @Resource
    private CouponFeignService couponFeignService;

    @RequestMapping("/coupons")
    public R getMemberCoupons(){
        MemberEntity memberEntity = new MemberEntity();
<<<<<<< HEAD
        memberEntity.setNickname("cchu");
=======
        memberEntity.setNickname("fireNay");
>>>>>>> ca0ed446bf0eb3e65dd4b881427e2993d04a31f6
        // 远程调用
        System.out.println(couponFeignService);
        R memberCoupons = couponFeignService.memberCoupons();
        return R.ok().put("member", memberEntity).put("coupons", memberCoupons.get("coupons"));
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("member:member:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("member:member:info")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("member:member:save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("member:member:update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("member:member:delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
