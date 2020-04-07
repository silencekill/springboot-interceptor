package org.javaboy.interceptor.config;

import org.javaboy.interceptor.interceptor.MyInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor())
                // 拦截的请求
                .addPathPatterns("/**");
                // 不拦截的请求
                //.excludePathPatterns("");

    }

    @Bean
    MyInterceptor myInterceptor(){
        return new MyInterceptor();
    }
}
