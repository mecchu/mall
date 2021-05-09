package me.cchu.mall.order.config;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;


@Configuration
public class FeignConfig {

	@Bean("requestInterceptor")
	public RequestInterceptor requestInterceptor(){
		// Feign在远程调用之前都会先经过这个方法
		return template -> {
			// RequestContextHolder拿到刚进来这个请求
			ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
			if(attributes != null){
				HttpServletRequest request = attributes.getRequest();
				// 同步请求头数据
				String cookie = request.getHeader("Cookie");
				// 给新请求同步Cookie
				template.header("Cookie", cookie);
			}
		};
	}
}
