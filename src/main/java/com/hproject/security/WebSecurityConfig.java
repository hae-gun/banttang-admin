package com.hproject.security;

import com.hproject.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@RequiredArgsConstructor
@EnableWebSecurity
@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    private final UserService userService;

    @Override
    public void configure(WebSecurity web) {
        web.ignoring().antMatchers("/css/**", "/js/**", "/img/**");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception { // 5
                http
//                .csrf().disable()
                .authorizeRequests() // 6
                .antMatchers("/login", "/signup", "/user", "/home","/static/login").permitAll() // 누구나 접근 허용
                .antMatchers("/").hasRole("USER") // USER, ADMIN만 접근 가능
                .antMatchers("/admin").hasRole("ADMIN") // ADMIN만 접근 가능
                .anyRequest().authenticated()
                .and()
                .formLogin().disable();// 나머지 요청들은 권한의 종류에 상관 없이 권한이 있어야 접근 가능
    }

//    @Override
//    public void configure(AuthenticationManagerBuilder auth) throws Exception { // 9
//        auth.userDetailsService(userService)
//                 해당 서비스(userService)에서는 UserDetailsService를 implements해서
//                 loadUserByUsername() 구현해야함 (서비스 참고)
//                .passwordEncoder(new BCryptPasswordEncoder());
//    }
}
