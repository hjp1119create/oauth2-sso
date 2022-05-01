package com.example;

import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
//@EnableOAuth2Sso
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                .authorizeRequests()
                .antMatchers("/login**", "/oauth2/authorization/**")
                .permitAll()
                .anyRequest().authenticated()
                .and().oauth2Login();
    }
    @Override
    public void configure(WebSecurity web) throws Exception {
        //静态资源
        web.ignoring().antMatchers("/favicon.ico", "/resources/**", "/static/**");
        web.ignoring().antMatchers("/login**");
        //web防火墙
        web.httpFirewall(null);
    }


}