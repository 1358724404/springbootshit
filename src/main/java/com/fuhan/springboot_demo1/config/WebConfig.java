package com.fuhan.springboot_demo1.config;

import com.fuhan.springboot_demo1.filter.MyFilter;
import com.fuhan.springboot_demo1.interceptor.MyInterceptor;
import com.fuhan.springboot_demo1.listener.MyListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author : FuHan
 * @description : ***
 * @date: 2019/10/21
 */
@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private MyFilter myFilter;

    @Autowired
    private MyListener myListener;

    @Autowired
    private MyInterceptor myInterceptor;

    @Bean
    public FilterRegistrationBean filterInit(){
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();
        registrationBean.setFilter(myFilter);
        registrationBean.setName("MyFilter");
        registrationBean.addUrlPatterns("/*");
        return registrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean listenerInit(){
        ServletListenerRegistrationBean registrationBean = new ServletListenerRegistrationBean();
        registrationBean.setListener(myListener);
        return registrationBean;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(myInterceptor).addPathPatterns("/**");
    }
}
