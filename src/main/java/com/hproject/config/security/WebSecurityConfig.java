package com.hproject.config.security;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@RequiredArgsConstructor
@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


//    @Bean
//    public SecurityAuthenticationFilter securityAuthenticationFilter() {
//        return new SecurityAuthenticationFilter();
//    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .cors().and()
                .csrf().disable()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .authorizeRequests()
                .antMatchers(HttpMethod.OPTIONS, "/**").permitAll()
                .antMatchers("/api/v1/test/permit-all").permitAll()
                .antMatchers("/h2-console/**").permitAll()
                .antMatchers("/api/v1/test/auth").authenticated()
                .antMatchers("/**").authenticated()
                .anyRequest().permitAll()
                .and()
                .formLogin().disable();
        http.headers().frameOptions().disable();
        http.csrf() // 추가
                .ignoringAntMatchers("/h2-console/**").disable() // 추가
                .httpBasic();
//        http
//                .addFilterBefore(securityAuthenticationFilter(), UsernamePasswordAuthenticationFilter.class);
    }
    public void configure(WebSecurity web)throws Exception{
        web.ignoring().antMatchers("/h2-console/**");
    }
}
