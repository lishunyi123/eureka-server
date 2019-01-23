package com.lishunyi.eurekaserver.com.service;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @ClassName: WebSecurityConfigurer
 * @Description: WebSecurity校验类
 * @Author: 李顺仪
 * @Date: 2019/1/23 14:54
 * @Version: 1.0
 */
@EnableWebSecurity
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {

    /**
     * 关闭csrf校验
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable();
        super.configure(http);
    }
}
