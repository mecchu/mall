package me.cchu.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import me.cchu.common.utils.PageUtils;
import me.cchu.mall.member.entity.MemberEntity;
import me.cchu.mall.member.exception.PhoneException;
import me.cchu.mall.member.exception.UsernameException;
import me.cchu.mall.member.vo.MemberLoginVo;
import me.cchu.mall.member.vo.SocialUser;
import me.cchu.mall.member.vo.UserRegisterVo;

import java.util.Map;

/**
 * 会员
 *
 * @author cchu
 * @email cchu@cchu.me
 * @date 2021-04-11 16:41:03
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void register(UserRegisterVo userRegisterVo) throws PhoneException, UsernameException;

    void checkPhone(String phone) throws PhoneException;

    void checkUserName(String username) throws UsernameException;

    /**
     * 普通登录
     */
    MemberEntity login(MemberLoginVo vo);

    /**
     * 社交登录
     */
    MemberEntity login(SocialUser socialUser);
}

