package me.cchu.mall.seckill.config;

import com.alibaba.fastjson.JSON;
import me.cchu.common.exception.BizCodeEnum;
import me.cchu.common.utils.R;
import org.springframework.context.annotation.Configuration;

/**
 * <p>Title: SecKillSentinelConfig</p>
 * Description：配置请求被限制以后的处理器
 */
//@Configuration
public class SecKillSentinelConfig {

	public SecKillSentinelConfig(){
//		WebCallbackManager.setUrlBlockHandler((request, response, exception) -> {
//			R error = R.error(BizCodeEnum.TO_MANY_REQUEST.getCode(), BizCodeEnum.TO_MANY_REQUEST.getMsg());
//			response.setCharacterEncoding("UTF-8");
//			response.setContentType("application/json");
//			response.getWriter().write(JSON.toJSONString(error));
//		});

//		ControllerAdvic
	}
}
