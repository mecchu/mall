package me.cchu.mall.cart.config;

import me.cchu.mall.cart.interceptor.CartInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * <p>Title: GlMallWebConfig</p>
 * Description：
 * date：2020/6/27 22:48
 */
@Configuration
public class GlMallWebConfig implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new CartInterceptor()).addPathPatterns("/**");
	}
}
