package me.cchu.mall.cart.config;

import me.cchu.mall.cart.interceptor.CartInterceptor;
import me.cchu.mall.cart.interceptor.TestInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@Configuration
public class MallWebConfig implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// 添加拦截器
		registry.addInterceptor(new CartInterceptor()).addPathPatterns("/**");

		registry.addInterceptor(new TestInterceptor()).addPathPatterns("/**");
	}
}
